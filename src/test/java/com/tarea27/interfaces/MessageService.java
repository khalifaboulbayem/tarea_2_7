package com.tarea27.interfaces;
import java.util.*;

import com.tarea27.models.Message;


public interface MessageService {
	void sendMessage(String subjet, String from, String to, String content);
	List<Message> getAllMessage();
	List<Message> getMessagesByUserName();
}
