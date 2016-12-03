package com.foodgood.server.service;

import com.foodgood.server.entity.Restaurant;
import com.foodgood.server.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestaurantRepository repository;

    public List<Restaurant> getAll() {
        return repository.findAll();
    }

    public Restaurant getByID(long id) {
        return repository.findOne(id);
    }

    public Restaurant save(Restaurant restaurant) {
        return repository.saveAndFlush(restaurant);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
