package com.foodgood.server.service;

import com.foodgood.server.entity.Kitchen;

import java.util.List;

public interface KitchenService {

    List<Kitchen> getAll();
    Kitchen getByID(long id);
    Kitchen save(Kitchen kitchen);
    void remove(long id);

}
