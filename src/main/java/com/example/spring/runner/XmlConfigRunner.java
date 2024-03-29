package com.example.spring.runner;

import com.example.spring.controller.UserController;
import com.example.spring.domain.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.repository.UserRepository;
import com.example.spring.repository.impl.UserRepositoryImpl;

public class XmlConfigRunner implements ConfigRunner{

	private static final String SPRING_BEANS_XML_FILENAME = "SpringBeans.xml";

	@Override
	public void run() {
		System.out.println("Running " + this.getClass().getName());
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(SPRING_BEANS_XML_FILENAME);
		
		UserController uc= context.getBean(UserController.class);
		uc.createUser(new User());
		System.out.println(200);
		
	}

}
