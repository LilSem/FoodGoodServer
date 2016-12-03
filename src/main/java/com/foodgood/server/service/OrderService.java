package com.foodgood.server.service;

import com.foodgood.server.entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAll();
    Order getByID(long id);
    Order save(Order order);
    void remove(long id);

}
