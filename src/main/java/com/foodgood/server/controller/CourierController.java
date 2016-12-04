package com.foodgood.server.controller;

import com.foodgood.server.entity.Courier;
import com.foodgood.server.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourierController {

    @Autowired
    private CourierService service;

    @RequestMapping(value = "/couriers", method = RequestMethod.GET)
    @ResponseBody
    public List<Courier> getAllCouriers() {
        return service.getAll();
    }

    @RequestMapping(value = "/couriers/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Courier getCourier(@PathVariable("id") long courierID) {
        return service.getByID(courierID);
    }

    @RequestMapping(value = "/couriers", method = RequestMethod.POST)
    @ResponseBody
    public Courier saveCourier(@RequestBody Courier courier) {
        return service.save(courier);
    }

    @RequestMapping(value = "/couriers/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.remove(id);
    }
}
