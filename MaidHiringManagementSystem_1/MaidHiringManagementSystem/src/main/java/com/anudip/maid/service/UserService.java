package com.anudip.maid.service;

import java.util.Collection;
import java.util.List;

import com.anudip.maid.entity.User;

public interface UserService {
    User loadUserByUsername(String username);
    List<User> getAllUsers();
    User getUserById(Long id);
    User saveUser(User user);
    void deleteUser(Long id);
    
}
