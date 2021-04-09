package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.Collection;

public interface UserService {
    void addUser(User user);
    void deleteUser(Integer userid);
    Collection<User> getUsers();
    User getUserById(Integer userid);

}
