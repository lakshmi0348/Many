package com.example.ManytoMany.service;

import com.example.ManytoMany.model.Employee;
import com.example.ManytoMany.projectModel.Project;
import com.example.ManytoMany.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> getallEmployees()
    {
        return employeeRepository.findAll();
    }
    public Optional<Employee> getEmpByid(Integer id)
    {
        if(!employeeRepository.existsById(id))
            throw new RuntimeException("ID IS NOT FOUND");
        return employeeRepository.findById(id);
    }
    public Employee updateEmp(Integer id,Employee employee)
    {
        if(!employeeRepository.existsById(id))
            throw new RuntimeException("ID IS NOT FOUND");
        employee.setEmpname(employee.getEmpname());
        return employeeRepository.save(employee);
    }
    public Employee saveEmp(Employee employee)
    {
        employee.setEmpname(employee.getEmpname());
        return employeeRepository.save(employee);
    }
    public  void DeleteEmp(Integer id)
    {
        if(!employeeRepository.existsById(id))
            throw new RuntimeException();
        employeeRepository.deleteById(id);
    }
}
