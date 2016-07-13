package com.example.spring.controller;

import com.example.spring.domain.User;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class UserController {
	public UserController(){}
	public UserController(UserService srv){
		service=srv;
	}
	@Autowired
	@Qualifier("myFancyService")
	private UserService service;
	public void createUser(User user){
		service.save(user);
	}

	public void setService(UserService service) {
		//this.service=service;
	}
}
