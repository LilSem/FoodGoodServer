package com.foodgood.server.service;

import com.foodgood.server.entity.userRestaurant;
import com.foodgood.server.repository.UsersRestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRestaurantServiceImpl implements UserRestaurantService {

    @Autowired
    private UsersRestaurantRepository repository;

    public List<userRestaurant> getAll() {
        return repository.findAll();
    }

    public userRestaurant getByID(long id) {
        return repository.findOne(id);
    }

    public userRestaurant save(userRestaurant userRestaurant) {
        return repository.saveAndFlush(userRestaurant);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
