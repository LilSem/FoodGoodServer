package com.foodgood.server.service;

import com.foodgood.server.entity.Status;

import java.util.List;

public interface StatusService {

    List<Status> getAll();
    Status getByID(long id);
    Status save(Status status);
    void remove(long id);

}
