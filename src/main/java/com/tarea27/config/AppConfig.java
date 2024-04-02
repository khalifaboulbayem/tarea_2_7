package com.tarea27.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tarea27.controllers.MessageController;
import com.tarea27.services.MessageServiceImp;


@Configuration

@ComponentScan("com.tarea27")
public class AppConfig {
	
	//Configuran el Bean
	@Bean
	public MessageServiceImp messageServide() {
		return new MessageServiceImp();
	}
    @Bean
	//Configura el bean para el controlador
	public MessageController messageController() {
		return new MessageController(messageServide());
	}
   
}
