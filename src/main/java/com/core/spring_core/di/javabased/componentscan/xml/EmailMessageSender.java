package com.core.spring_core.di.javabased.componentscan.xml;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(value = "emailMessageSender")
public class EmailMessageSender implements MessageSender {

	public String sendMessage(String message) {
		System.out.println("EmailMessageSender");
		return message;
	}

}
