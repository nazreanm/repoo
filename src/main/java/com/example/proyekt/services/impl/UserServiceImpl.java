package com.example.proyekt.services.impl;

import com.example.proyekt.dao.requests.UserRequest;
import com.example.proyekt.entities.User;
import com.example.proyekt.repositories.UserRepository;
import com.example.proyekt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public User update(User user) {
        userRepository.findById(user.getId()).orElseThrow();
        return userRepository.save(user);
    }

    @Override
    public void create(UserRequest userRequest) {
        User user = User.builder().
                userName(userRequest.getUserName()).
                userSurname(userRequest.getUserSurname()).
                userAge(userRequest.getUserAge()).
                build();
        userRepository.save(user);
    }
}
