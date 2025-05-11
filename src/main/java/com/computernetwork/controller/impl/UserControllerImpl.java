package com.computernetwork.controller.impl;

import com.computernetwork.controller.IUserController;
import com.computernetwork.entity.User;
import com.computernetwork.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserControllerImpl implements IUserController {

    @Autowired
    private IUserService userService;

    @Override
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @Override
    @PostMapping
    public User saveUser(User user) {
        return userService.saveUser(user);
    }
}
