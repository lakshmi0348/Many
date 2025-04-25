package com.example.ManytoMany.controller;

import com.example.ManytoMany.model.Employee;
import com.example.ManytoMany.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmpByID(@PathVariable Integer id) {
        return employeeService.getEmpByid(id).
                map(ResponseEntity::ok).
                orElse(ResponseEntity.noContent().build());
    }
    @GetMapping("/getAllEmployee")
    public ResponseEntity<List<Employee>> getAllDetails()
    {
        return ResponseEntity.ok(employeeService.getallEmployees());
    }
    @PostMapping("/saveEmp")
    public ResponseEntity<Employee> saveDetails(@RequestBody Employee employee)
    {
        return ResponseEntity.ok(employeeService.saveEmp(employee));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id)
    {
        employeeService.DeleteEmp(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/update")
    public ResponseEntity<Employee> update(@PathVariable Integer id,Employee employee)
    {
        return ResponseEntity.ok(employeeService.updateEmp(id,employee));
    }

}