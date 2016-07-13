package com.example.spring.runner;

import com.example.spring.repository.UserRepository;
import com.example.spring.service.UserService;
import com.example.spring.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring.config.Config;
import com.example.spring.controller.UserController;
import com.example.spring.domain.User;

public class JavaConfigRunner implements ConfigRunner {

	@Override
	public void run() {
		System.out.println("Running " + this.getClass().getName());
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		UserController userController = context.getBean(UserController.class);
		//((UserServiceImpl)context.getBean(UserService.class)).setRepo(context.getBean(UserRepository.class));
		//userController.setService(context.getBean(UserService.class));
		userController.createUser(new User());

		context.registerShutdownHook();
	}
	
}
