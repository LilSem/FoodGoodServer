package com.foodgood.server.service;

import com.foodgood.server.entity.Courier;
import com.foodgood.server.repository.CourierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourierServiceImpl implements CourierService {

    @Autowired
    private CourierRepository repository;

    public List<Courier> getAll() {
        return repository.findAll();
    }

    public Courier getByID(long id) {
        return repository.findOne(id);
    }

    public Courier save(Courier courier) {
        return repository.saveAndFlush(courier);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
