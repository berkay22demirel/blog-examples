package com.berkay22demirel.postgresqlexample.controller;

import com.berkay22demirel.postgresqlexample.entity.Item;
import com.berkay22demirel.postgresqlexample.service.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
@AllArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping
    public ResponseEntity<Item> add(@RequestBody Item item) {
        return ResponseEntity.ok(itemService.save(item));
    }

    @GetMapping("{projectId}")
    public ResponseEntity<List<Item>> inquiry(@PathVariable Long projectId) {
        return ResponseEntity.ok(itemService.getByProjectId(projectId));
    }
}
