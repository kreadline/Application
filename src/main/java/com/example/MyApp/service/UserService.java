package com.example.MyApp.service;

import com.example.MyApp.models.User;


import java.util.List;

public interface UserService {
    List<User> getUsers();
    User showUserById(Long id);
    void saveUser(User user);
    void deleteUserById(Long id);
    void updateUserById(Long id, User user);
}
