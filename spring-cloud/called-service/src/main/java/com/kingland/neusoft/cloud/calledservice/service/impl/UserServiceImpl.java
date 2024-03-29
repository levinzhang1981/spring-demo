package com.kingland.neusoft.cloud.calledservice.service.impl;



import com.kingland.neusoft.cloud.calledservice.model.User;
import com.kingland.neusoft.cloud.calledservice.repository.UserRepository;
import com.kingland.neusoft.cloud.calledservice.service.UserService;

import java.util.List;


public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }

    @Override
    public User addUser(User user) {
        return userRepository.addUser(user);
    }
}
