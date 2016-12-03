package com.foodgood.server.service;

import com.foodgood.server.entity.Order;
import com.foodgood.server.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> getAll() {
        return repository.findAll();
    }

    public Order getByID(long id) {
        return repository.findOne(id);
    }

    public Order save(Order order) {
        return repository.saveAndFlush(order);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
