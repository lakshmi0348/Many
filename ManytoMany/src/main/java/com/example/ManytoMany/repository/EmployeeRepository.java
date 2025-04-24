package com.example.ManytoMany.repository;

import com.example.ManytoMany.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee ,Integer>
{

}
