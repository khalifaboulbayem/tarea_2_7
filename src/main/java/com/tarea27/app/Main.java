package com.tarea27.app;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tarea27.config.AppConfig;
import com.tarea27.controllers.MessageController;
import com.tarea27.controllers.UserController;
import com.tarea27.models.Message;
import com.tarea27.models.User;

public class Main {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();
		
		MessageController messageController = context.getBean(MessageController.class);
		
		UserController userController = context.getBean(UserController.class);
		
		User khalifa = userController.addUser(new User("Khalifa", "Khalifa@khalifa.com"));
		User angel = userController.addUser(new User("Angel", "Angel@Angel.com"));
		User andres = userController.addUser(new User("andres", "andres@andres.com"));
		User luis = userController.addUser(new User("luis", "luis@luis.com"));
		
		
		Message msg1 = new Message("Subjet 1", angel, khalifa, "Mensaje enviado por angel a khalifa");
		Message msg2 = new Message("Subjet 2", angel, andres, "Message enviado por angel a andres");
		Message msg3 = new Message("Subjet 3", luis, khalifa, "Message enviado por luis a khalifa");
		
		messageController.sendMessage(msg1);
		messageController.sendMessage(msg2);
		messageController.sendMessage(msg3);
		
		List<User> users = userController.getAll();
		for(User user : users) {
			System.out.print("==========Mensajes de  "+ user.getName() + "========\n");
			System.out.print(user.getMessages().size() <= 0 ? "NO HAY MENSAJES \n" : user.getMessages() + "\n");
			
		}
		
		/*System.out.print("==========Mensajes de  ");
		System.out.print(khalifa.getMessages());
		System.out.print(angel.getMessages());*/
		
		
		context.close();
	}

}
