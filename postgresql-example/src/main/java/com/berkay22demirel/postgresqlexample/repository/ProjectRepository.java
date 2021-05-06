package com.berkay22demirel.postgresqlexample.repository;

import com.berkay22demirel.postgresqlexample.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
