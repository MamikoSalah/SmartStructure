package com.computernetwork.service;

import com.computernetwork.entity.User;

import java.util.List;

public interface IUserService {

    List<User>  getAllUsers();

    User saveUser(User user);

    User getUserById(Integer id);

    void deleteUser(Integer id);

}
