package com.foodgood.server.service;

import com.foodgood.server.entity.userRestaurant;

import java.util.List;

public interface UserRestaurantService {

    List<userRestaurant> getAll();
    userRestaurant getByID(long id);
    userRestaurant save(userRestaurant userRestaurant);
    void remove(long id);

}
