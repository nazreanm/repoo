package com.example.proyekt.services;

import com.example.proyekt.dao.requests.UserRequest;
import com.example.proyekt.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    List<User> list();
    User findById(Integer id);
    void deleteById(Integer id);
    User update(User role);
    void create(UserRequest userRequest);
}
