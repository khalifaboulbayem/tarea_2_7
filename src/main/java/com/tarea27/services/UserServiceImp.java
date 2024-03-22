package com.tarea27.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tarea27.interfaces.UserService;
import com.tarea27.models.User;


@Service
public class UserServiceImp implements UserService {
	List<User> users = new ArrayList<>();
	
	@Override
	public List<User> getAllUsers() {
		
		return users;
	}

	@Override
	public User addUser(User user) {
		users.add(user);
		return user;
	}
}
