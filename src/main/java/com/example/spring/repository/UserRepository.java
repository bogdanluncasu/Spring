package com.example.spring.repository;

import java.util.List;

import com.example.spring.domain.User;
import com.example.spring.repository.impl.UserFancyImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
	List<User> list();
	User get(int id);
	void save(User user);
}
