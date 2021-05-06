package com.berkay22demirel.postgresqlexample.repository;

import com.berkay22demirel.postgresqlexample.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByProjectId(Long projectId);
}
