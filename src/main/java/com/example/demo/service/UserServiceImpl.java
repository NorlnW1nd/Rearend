package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void deleteUser(Integer userid) {

    }

    @Override
    public Collection<User> getUsers() {
        return null;
    }

    @Override
    public User getUserById(Integer userid) {
        return null;
    }
}
