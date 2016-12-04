package com.foodgood.server.controller;

import com.foodgood.server.entity.Kitchen;
import com.foodgood.server.service.KitchenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KitchenController {

    @Autowired
    private KitchenService service;

    @RequestMapping(value = "/kitchens", method = RequestMethod.GET)
    @ResponseBody
    public List<Kitchen> getAllKitchens() {
        return service.getAll();
    }

    @RequestMapping(value = "/kitchens/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Kitchen getKitchen(@PathVariable("id") long kitchensID) {
        return service.getByID(kitchensID);
    }

    @RequestMapping(value = "/kitchens", method = RequestMethod.POST)
    @ResponseBody
    public Kitchen saveKitchen(@RequestBody Kitchen kitchen) {
        return service.save(kitchen);
    }

    @RequestMapping(value = "/kitchens/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.remove(id);
    }
}
