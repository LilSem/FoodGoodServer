package com.foodgood.server.service;

import com.foodgood.server.entity.Kitchen;
import com.foodgood.server.repository.KitchenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KitchenServiceImpl implements KitchenService {

    @Autowired
    private KitchenRepository repository;

    public List<Kitchen> getAll() {
        return repository.findAll();
    }

    public Kitchen getByID(long id) {
        return repository.findOne(id);
    }

    public Kitchen save(Kitchen kitchen) {
        return repository.saveAndFlush(kitchen);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
