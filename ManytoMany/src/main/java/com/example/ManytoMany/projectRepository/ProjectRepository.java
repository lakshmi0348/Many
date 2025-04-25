package com.example.ManytoMany.projectRepository;
import com.example.ManytoMany.projectModel.Project;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProjectRepository  extends JpaRepository<Project ,Integer>
{


}
