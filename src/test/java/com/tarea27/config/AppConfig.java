package com.tarea27.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tarea27.controllers.MessageController;
import com.tarea27.interfaces.MessageService;
import com.tarea27.services.MessageServiceImp;

@Configuration
@ComponentScan(basePackages = "com.tarea27")
public class AppConfig {
	
	//Configuran el Bean
	@Bean
	public MessageService messageServide() {
		return new MessageServiceImp();
	}

	//Configura el bean para el controlador
	public MessageController messageController() {
		return new MessageController();
	}
}
