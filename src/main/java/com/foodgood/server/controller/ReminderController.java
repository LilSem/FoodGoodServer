package com.foodgood.server.controller;

import com.foodgood.server.entity.userRestaurant;
import com.foodgood.server.service.UserRestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReminderController {

    @Autowired
    private UserRestaurantService service;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public List<userRestaurant> getAllReminders() {
        return service.getAll();
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public userRestaurant getUserRestaurant(@PathVariable("id") long remindID) {
        return service.getByID(remindID);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public userRestaurant saveUserRestaurant(@RequestBody userRestaurant userRestaurant) {
        return service.save(userRestaurant);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.remove(id);
    }
}
