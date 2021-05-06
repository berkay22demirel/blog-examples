package com.berkay22demirel.postgresqlexample.controller;

import com.berkay22demirel.postgresqlexample.entity.Project;
import com.berkay22demirel.postgresqlexample.service.ProjectService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
@AllArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    @PostMapping
    public ResponseEntity<Project> add(@RequestBody Project project) {
        return ResponseEntity.ok(projectService.save(project));
    }

    @GetMapping
    public ResponseEntity<List<Project>> inquiry() {
        return ResponseEntity.ok(projectService.getAll());
    }
}
