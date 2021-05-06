package com.berkay22demirel.postgresqlexample.service;

import com.berkay22demirel.postgresqlexample.entity.Project;

import java.util.List;

public interface ProjectService {

    Project save(Project project);

    void delete(Long id);

    Project get(Long id);

    List<Project> getAll();
}
