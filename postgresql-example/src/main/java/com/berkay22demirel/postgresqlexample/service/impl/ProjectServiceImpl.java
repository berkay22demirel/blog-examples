package com.berkay22demirel.postgresqlexample.service.impl;

import com.berkay22demirel.postgresqlexample.entity.Project;
import com.berkay22demirel.postgresqlexample.repository.ProjectRepository;
import com.berkay22demirel.postgresqlexample.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public void delete(Long id) {
        projectRepository.deleteById(id);
    }

    @Override
    public Project get(Long id) {
        return projectRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Project> getAll() {
        return projectRepository.findAll();
    }
}
