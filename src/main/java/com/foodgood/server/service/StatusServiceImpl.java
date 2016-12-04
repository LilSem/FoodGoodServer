package com.foodgood.server.service;

import com.foodgood.server.entity.Status;
import com.foodgood.server.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    private StatusRepository repository;

    public List<Status> getAll() {
        return repository.findAll();
    }

    public Status getByID(long id) {
        return repository.findOne(id);
    }

    public Status save(Status status) {
        return repository.saveAndFlush(status);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
