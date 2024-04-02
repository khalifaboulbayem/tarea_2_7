package com.tarea27.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tarea27.models.Message;
import com.tarea27.models.User;
import com.tarea27.services.MessageServiceImp;

@Controller
public class MessageController {
	
	private MessageServiceImp messageService;
	
	@Autowired
	public MessageController(MessageServiceImp msgService) {
		this.messageService = msgService;
	}
	
	
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
