package com.tarea27.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tarea27.config.AppConfig;
import com.tarea27.controllers.MessageController;
import com.tarea27.models.Message;
import com.tarea27.models.User;

public class Main {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();
		
		MessageController messageController = context.getBean(MessageController.class);
		User khalifa = new User("Khalifa", "Khalifa@khalifa.com");
		User angel = new User("Angel", "Angel@Angel.com");
		User andres = new User("andres", "andres@andres.com");
		User luis = new User("luis", "luis@luis.com");
		
		Message msg1 = new Message("Subjet 1", angel, khalifa, "Message content 1");
		messageController.sendMessage(msg1);
		System.out.print(msg1);
		
		System.out.print(khalifa.getMessages());
		System.out.print(angel.getMessages());
		
		
		context.close();
	}

}
