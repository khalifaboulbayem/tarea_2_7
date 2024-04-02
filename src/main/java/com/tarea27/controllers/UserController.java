package com.tarea27.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.tarea27.models.User;
import com.tarea27.services.UserServiceImp;

@Controller
public class UserController {

	private final UserServiceImp userService;
	
	public UserController(UserServiceImp userService) {
		this.userService = userService;
	}
	
	
	public List<User> getAll() {
		return userService.getAllUsers();
	}
	
	public User addUser(User user) {
		return userService.addUser(user);
	}
}
