package com.core.spring_core.di.javabased.componentscan.xml;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(value = "whatsAppMessageSender")
public class WhatsAppMessageSender implements MessageSender {

	public String sendMessage(String message) {
		System.out.println("WhatsAppMessageSender");
		return message;
	}

}
