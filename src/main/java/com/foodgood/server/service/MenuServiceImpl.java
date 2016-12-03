package com.foodgood.server.service;

import com.foodgood.server.entity.Menu;
import com.foodgood.server.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository repository;

    public List<Menu> getAll() {
        return repository.findAll();
    }

    public Menu getByID(long id) {
        return repository.findOne(id);
    }

    public Menu save(Menu menu) {
        return repository.saveAndFlush(menu);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
