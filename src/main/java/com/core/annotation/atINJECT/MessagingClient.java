package com.core.annotation.atINJECT;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessagingClient {

	@Bean
	public MessagingService messagingService() {
		return new MessagingService();
	}

	@Bean
	public ChatBoxService chatBoxService() {
		return new ChatBoxService();
	}

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MessagingClient.class);
		context.getBean(ChatBoxService.class).sendMessage("How are you?");
	}
}
