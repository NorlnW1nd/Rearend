package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class UserDaoImpl implements UserDao {
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
