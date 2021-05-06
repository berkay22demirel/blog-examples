package com.berkay22demirel.postgresqlexample.service;

import com.berkay22demirel.postgresqlexample.entity.Item;

import java.util.List;

public interface ItemService {

    Item save(Item item);

    void delete(Long id);

    Item get(Long id);

    List<Item> getByProjectId(Long projectId);

    void setToInProgress(Long id);

    void setToDone(Long id);
}
