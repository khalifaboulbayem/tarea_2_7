package com.tarea27.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tarea27.interfaces.MessageService;
import com.tarea27.models.Message;
import com.tarea27.models.User;

@Service
public class MessageServiceImp implements MessageService {

	List<Message> mensajes = new ArrayList<>();
	@Override
	public void sendMessage(String subjet, String from, String to, String content) {
		Message message = new Message(subjet, from, to, content);
		mensajes.add(message);

	}

	@Override
	public List<Message> getAllMessage() {
		return mensajes;
	}
	
	@Override
	public List<Message> getMessagesByUser(User user) {
		return user.getMessages();
	}
}
