package com.foodgood.server.service;

import com.foodgood.server.entity.User;
import com.foodgood.server.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepository repository;

    public List<User> getAll() {
        return repository.findAll();
    }

    public User getByID(long id) {
        return repository.findOne(id);
    }

    public User save(User user) {
        return repository.saveAndFlush(user);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
