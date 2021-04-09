package com.example.demo.dao;

import com.example.demo.pojo.User;

import java.util.Collection;

public interface UserDao {
    void addUser(User user);
    void deleteUser(Integer userid);
    Collection<User> getUsers();
    User getUserById(Integer userid);
    void csshso();
}
