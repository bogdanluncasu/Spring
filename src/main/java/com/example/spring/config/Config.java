package com.example.spring.config;

import com.example.spring.repository.UserRepository;
import com.example.spring.repository.impl.UserRepositoryImpl;
import com.example.spring.service.UserService;
import com.example.spring.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.spring.controller.UserController;
import org.springframework.context.annotation.Scope;

import javax.annotation.Resource;

@Configuration
@ComponentScan("com.example.spring") // search the ... package for @Component classes
public class Config {
	@Bean
	public UserController createUserController(){
		return new UserController();
	}


	@Bean
	@Scope("prototype")
	public UserRepository createUserRepository(){
		return new UserRepositoryImpl();
	}


}
