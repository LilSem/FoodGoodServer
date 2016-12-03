package com.foodgood.server.controller;

import com.foodgood.server.entity.Restaurant;
import com.foodgood.server.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService service;

    @RequestMapping(value = "/restaurant", method = RequestMethod.GET)
    @ResponseBody
    public List<Restaurant> getAllRestaurant() {
        return service.getAll();
    }

    @RequestMapping(value = "/restaurant/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Restaurant getRestaurant(@PathVariable("id") long restaurantID) {
        return service.getByID(restaurantID);
    }

    @RequestMapping(value = "/restaurant", method = RequestMethod.POST)
    @ResponseBody
    public Restaurant saveMenuRestaurant(@RequestBody Restaurant restaurant) {
        return service.save(restaurant);
    }

    @RequestMapping(value = "/restaurant/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.remove(id);
    }
}
