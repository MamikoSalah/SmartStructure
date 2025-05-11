package com.computernetwork.controller;

import com.computernetwork.entity.User;

import java.util.List;

public interface IUserController {

    List<User> getAllUsers();

    User saveUser(User user);

    User getUserById(Integer id);

    void deleteUser(Integer id);
}
