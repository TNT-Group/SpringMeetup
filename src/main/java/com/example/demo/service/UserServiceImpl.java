package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> readAll() {
        return userRepository.findAll();
    }

    @Override
    public User read(int id) {
        return userRepository.getOne(id);
    }

    @Override
    public User create(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public User update(User user, int id) {
        if (userRepository.existsById(id)) {
            user.setId(id);
            userRepository.save(user);
        }
        return user;
    }

    @Override
    public boolean delete(int id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
        }
        return false;
    }
}
