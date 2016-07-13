package com.example.spring.repository.impl;

import java.util.List;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository{


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
		System.out.println("User inserted in database");
	}

}
