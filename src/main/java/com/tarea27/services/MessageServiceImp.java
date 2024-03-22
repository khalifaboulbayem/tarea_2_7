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
	public void sendMessage(Message message) {
		mensajes.add(message);
		message.getDestenatario().addMessage(message);
		System.out.print("\n ¡MENSAJE ENVIADO! \n \n");
		
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
