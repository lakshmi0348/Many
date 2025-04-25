package com.example.ManytoMany.projectcontroller;
import com.example.ManytoMany.projectModel.Project;
import com.example.ManytoMany.projectService.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
public class ProjectController {
    @Autowired
   private ProjectService projectService;
    @GetMapping("project/{id}")
    public ResponseEntity<Optional<Project>> getUserById(@PathVariable Integer id)
    {
        return ResponseEntity.ok(projectService.getusersbyid(id));
    }
    @GetMapping("allProjects")
    public ResponseEntity<List<Project>> getAllProjects()
    {
        return ResponseEntity.ok(projectService.getallusers());
    }
    @PutMapping("project/{id}")
    public ResponseEntity<Project> updateAllUsers(@PathVariable Integer id,Project project)
    {
        return ResponseEntity.ok(projectService.updateallusers(id,project));
    }
    @PostMapping("/project")
    public ResponseEntity<Project> saveUsers(@RequestBody Project project)
    {
        return ResponseEntity.ok(projectService.saveusers(project));
    }
    @DeleteMapping("project/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id)
    {
        projectService.deleteallusers(id);
        return ResponseEntity.noContent().build();
    }
}
