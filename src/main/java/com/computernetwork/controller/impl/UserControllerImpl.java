package com.computernetwork.controller.impl;

import com.computernetwork.controller.IUserController;
import com.computernetwork.entity.User;
import com.computernetwork.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserControllerImpl implements IUserController {

    @Autowired
    private IUserService userService;

    @Override
    @GetMapping("/list")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @Override
    @PostMapping("/save")
    public User saveUser(User user) {
        return userService.saveUser(user);
    }

    @Override
    @GetMapping("/{id}")
    public User getUserById(@PathVariable(name = "id") Integer id) {
        return userService.getUserById(id);
    }

    @Override
    @DeleteMapping("/delete/{id}")
    public void deleteUser(Integer id) {
        userService.deleteUser(id);
    }
}
