package com.example.spring.repository.impl;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by bluncasu on 7/13/2016.
 */
@Primary
@Repository
public class UserFancyImpl implements UserRepository {
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
        System.out.println("TEST");
    }
    @PostConstruct
    public void finish(){
        System.out.println("Finish");
    }
}
