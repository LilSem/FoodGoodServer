package com.foodgood.server.service;

import com.foodgood.server.entity.Menu;

import java.util.List;

public interface MenuService {

    List<Menu> getAll();
    Menu getByID(long id);
    Menu save(Menu menu);
    void remove(long id);

}
