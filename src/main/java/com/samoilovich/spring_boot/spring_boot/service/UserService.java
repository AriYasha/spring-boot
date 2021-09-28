package com.samoilovich.spring_boot.spring_boot.service;

import com.samoilovich.spring_boot.spring_boot.model.User;


import java.util.List;

public interface UserService {
     List getAllUsers();
     User getUserById(Long id);
     void saveUser(User user);
     void updateUser(User user);
     void deleteUserById(Long id);
}