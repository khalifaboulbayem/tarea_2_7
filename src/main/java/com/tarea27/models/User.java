package com.tarea27.models;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	String name;
	String email;
	List<Message> messages;
	
	public User(String name, String email) {
		this.name = name;
		this.email = email;
		this.messages = new ArrayList<>();
	}
	
	
	public void addMessage(Message message) {
		this.messages.add(message);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List<Message> getMessages() {
		return messages;
	}

}
