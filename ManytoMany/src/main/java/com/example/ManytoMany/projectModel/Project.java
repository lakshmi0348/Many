package com.example.ManytoMany.projectModel;

import com.example.ManytoMany.model.Employee;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="Project_Table")

public class Project {
    @JsonIgnore
    @ManyToMany(mappedBy = "projectSet")
    private Set<Employee> employees ;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String project_name;
}
