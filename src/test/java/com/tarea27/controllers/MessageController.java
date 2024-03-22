package com.tarea27.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tarea27.models.Message;
import com.tarea27.models.User;
import com.tarea27.services.MessageServiceImp;

public class MessageController {
	
	@Autowired
	MessageServiceImp messageService;
	
	
	public List<Message> getAll() {
		return messageService.getAllMessage();
	}
	
	public void sendMessage(Message msg) {
		messageService.sendMessage(msg.getSubjet(), msg.getRemitente(), msg.getDestenatario(), msg.getContent());
	}
	
	public List<Message> getMessagesByUser(User user) {
		return messageService.getMessagesByUser(user);
	}

}
