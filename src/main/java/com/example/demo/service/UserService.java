package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> readAll();

    User read(int id);

    User create(User user);

    User update(User user, int id);

    boolean delete(int id);
}
