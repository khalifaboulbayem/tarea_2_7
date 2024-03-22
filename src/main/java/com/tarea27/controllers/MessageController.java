package com.tarea27.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

import com.tarea27.models.Message;
import com.tarea27.models.User;
import com.tarea27.services.MessageServiceImp;

@Controller
@ComponentScan("com.tarea27.services")
public class MessageController {
	
	@Autowired
	MessageServiceImp messageService;
	
	
	public List<Message> getAll() {
		return messageService.getAllMessage();
	}
	
	public void sendMessage(Message msg) {
		messageService.sendMessage(msg);
	}
	
	public List<Message> getMessagesByUser(User user) {
		return messageService.getMessagesByUser(user);
	}

}
