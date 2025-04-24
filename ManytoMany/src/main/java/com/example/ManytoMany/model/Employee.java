package com.example.ManytoMany.model;

import com.example.ManytoMany.projectModel.Project;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="EmployeeTable")
public class Employee {
    @ManyToMany
    @JoinTable(
           name = "EmployeeTables",
            joinColumns = @JoinColumn(name = "Empid"),
            inverseJoinColumns = @JoinColumn(name = "Project_id")
            )
    private Set<Project> projectSet;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Empid")
    private int id;
    @JsonProperty("empname")
    private String Empname;
}
