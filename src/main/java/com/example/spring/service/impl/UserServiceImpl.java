package com.example.spring.service.impl;

import java.util.List;

import com.example.spring.config.Config;
import com.example.spring.controller.UserController;
import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements UserService,ApplicationContextAware{


      @Autowired
//    @Qualifier("createUserRepository")
        private UserRepository repo;


        public void setRepo(UserRepository repo) {
            //this.repo = repo;
        }


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
            repo.save(user);
        }



    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
       // this.repo=applicationContext.getBean(UserRepository.class);
    }
}
