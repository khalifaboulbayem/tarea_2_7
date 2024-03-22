package com.tarea27.interfaces;
import java.util.*;

import com.tarea27.models.Message;
import com.tarea27.models.User;


public interface MessageService {
	void sendMessage(Message msg);
	List<Message> getAllMessage();
	List<Message> getMessagesByUser(User user);
}
