package com.computernetwork.service.impl;

import com.computernetwork.entity.User;
import com.computernetwork.repository.UserRepository;
import com.computernetwork.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Integer id) {

        return userRepository.findById(id).orElse(null);

    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
