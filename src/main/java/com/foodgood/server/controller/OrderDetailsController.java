package com.foodgood.server.controller;
import com.foodgood.server.entity.OrderDetails;
import com.foodgood.server.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderDetailsController {

    @Autowired
    private OrderDetailsService service;

    @RequestMapping(value = "/details", method = RequestMethod.GET)
    @ResponseBody
    public List<OrderDetails> getAllOrderDetails() {
        return service.getAll();
    }

    @RequestMapping(value = "/details/{id}", method = RequestMethod.GET)
    @ResponseBody
    public OrderDetails getOrderDetails(@PathVariable("id") long orderDetailsID) {
        return service.getByID(orderDetailsID);
    }

    @RequestMapping(value = "/details", method = RequestMethod.POST)
    @ResponseBody
    public OrderDetails saveOrderDetails(@RequestBody OrderDetails orderDetails) {
        return service.save(orderDetails);
    }

    @RequestMapping(value = "/details/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.remove(id);
    }
}
