package com.berkay22demirel.postgresqlexample.service.impl;

import com.berkay22demirel.postgresqlexample.entity.Item;
import com.berkay22demirel.postgresqlexample.repository.ItemRepository;
import com.berkay22demirel.postgresqlexample.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public Item save(Item item) {
        item.setStatus(Item.Status.TODO);
        return itemRepository.save(item);
    }

    @Override
    public void delete(Long id) {
        itemRepository.deleteById(id);
    }

    @Override
    public Item get(Long id) {
        return itemRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Item> getByProjectId(Long projectId) {
        return itemRepository.findByProjectId(projectId);
    }

    @Override
    public void setToInProgress(Long id) {
        Item item = itemRepository.findById(id).orElseThrow();
        item.setStatus(Item.Status.IN_PROGRESS);
        itemRepository.save(item);
    }

    @Override
    public void setToDone(Long id) {
        Item item = itemRepository.findById(id).orElseThrow();
        item.setStatus(Item.Status.DONE);
        itemRepository.save(item);
    }
}
