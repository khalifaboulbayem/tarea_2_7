package com.tarea27.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

import com.tarea27.models.User;
import com.tarea27.services.UserServiceImp;

@Controller
@ComponentScan("com.tarea27.services")
public class UserController {

	@Autowired
	UserServiceImp userService;
	
	
	public List<User> getAll() {
		return userService.getAllUsers();
	}
	
	public User addUser(User user) {
		return userService.addUser(user);
	}
}
