package com.example.spring.service.impl;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bluncasu on 7/13/2016.
 */
@Service("myFancyService")
public class UserFancyServiceImpl implements UserService {
    @Autowired
    private UserRepository u;
    @Override
    public List<User> list() {
        return null;
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public void save(User user) {
        System.out.println("Fancy Service");
        u.save(user);
    }
}
