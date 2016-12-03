package com.foodgood.server.controller;

import com.foodgood.server.entity.Menu;
import com.foodgood.server.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MenuController {

    @Autowired
    private MenuService service;

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    @ResponseBody
    public List<Menu> getAllDish() {
        return service.getAll();
    }

    @RequestMapping(value = "/menu/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Menu getMenuRestaurant(@PathVariable("id") long dishID) {
        return service.getByID(dishID);
    }

    @RequestMapping(value = "/menu", method = RequestMethod.POST)
    @ResponseBody
    public Menu saveMenuRestaurant(@RequestBody Menu menu) {
        return service.save(menu);
    }

    @RequestMapping(value = "/menu/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.remove(id);
    }
}
