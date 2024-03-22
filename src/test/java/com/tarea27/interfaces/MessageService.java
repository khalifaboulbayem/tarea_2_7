package com.tarea27.interfaces;
import java.util.*;


public interface MessageService {
	void sendMessage(String subjet, String from, String to);
	List<Message> getAllMessage();
}
