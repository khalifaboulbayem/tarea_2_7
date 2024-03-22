package com.tarea27.interfaces;

import java.util.List;

import com.tarea27.models.User;

public interface UserService {
	
	List<User> getAllUsers();
	User addUser(User user);
}
