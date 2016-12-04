package com.foodgood.server.service;

import com.foodgood.server.entity.OrderDetails;

import java.util.List;

public interface OrderDetailsService {

    List<OrderDetails> getAll();
    OrderDetails getByID(long id);
    OrderDetails save(OrderDetails orderDetails);
    void remove(long id);

}
