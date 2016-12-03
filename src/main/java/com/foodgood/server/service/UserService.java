package com.foodgood.server.service;

import com.foodgood.server.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User getByID(long id);
    User save(User user);
    void remove(long id);

}
