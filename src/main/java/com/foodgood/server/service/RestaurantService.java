package com.foodgood.server.service;

import com.foodgood.server.entity.Restaurant;

import java.util.List;

public interface RestaurantService {

    List<Restaurant> getAll();
    Restaurant getByID(long id);
    Restaurant save(Restaurant restaurant);
    void remove(long id);

}
