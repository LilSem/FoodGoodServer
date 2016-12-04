package com.foodgood.server.controller;

import com.foodgood.server.entity.Status;
import com.foodgood.server.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StatusController {

    @Autowired
    private StatusService service;

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    @ResponseBody
    public List<Status> getAllStatus() {
        return service.getAll();
    }

    @RequestMapping(value = "/status/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Status getStatus(@PathVariable("id") long statusID) {
        return service.getByID(statusID);
    }

    @RequestMapping(value = "/status", method = RequestMethod.POST)
    @ResponseBody
    public Status saveStatus(@RequestBody Status status) {
        return service.save(status);
    }

    @RequestMapping(value = "/status/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.remove(id);
    }
}
