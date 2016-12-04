package com.foodgood.server.service;

import com.foodgood.server.entity.OrderDetails;
import com.foodgood.server.repository.OrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

    @Autowired
    private OrderDetailsRepository repository;

    public List<OrderDetails> getAll() {
        return repository.findAll();
    }

    public OrderDetails getByID(long id) {
        return repository.findOne(id);
    }

    public OrderDetails save(OrderDetails orderDetails) {
        return repository.saveAndFlush(orderDetails);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
