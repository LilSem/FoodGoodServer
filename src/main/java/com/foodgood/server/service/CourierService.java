package com.foodgood.server.service;

import com.foodgood.server.entity.Courier;

import java.util.List;

public interface CourierService {

    List<Courier> getAll();
    Courier getByID(long id);
    Courier save(Courier courier);
    void remove(long id);

}
