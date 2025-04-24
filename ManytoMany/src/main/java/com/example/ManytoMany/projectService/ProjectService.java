package com.example.ManytoMany.projectService;
import com.example.ManytoMany.projectModel.Project;
import com.example.ManytoMany.projectRepository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getallusers() {
        return projectRepository.findAll();

    }
    public Optional<Project> getusersbyid(Integer id) {
        if(!projectRepository.existsById(id))
            throw new RuntimeException();
        return projectRepository.findById(id);
    }
    public Project saveusers(Project project)
    {
        return projectRepository.save(project);
    }
    public Project updateallusers(Integer id,Project project) {
        if (!projectRepository.existsById(id))
            throw  new RuntimeException();
        project.setProject_name(project.getProject_name());
        return projectRepository.save(project);
    }
    public void deleteallusers(Integer id)
    {
        if(!projectRepository.existsById(id))
            throw  new RuntimeException();
        projectRepository.deleteById(id);
    }
}