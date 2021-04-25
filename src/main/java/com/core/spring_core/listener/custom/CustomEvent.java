package com.core.spring_core.listener.custom;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {
	
	private final String customMessage;

	public CustomEvent(Object source, String customMessage) {
		super(source);
		this.customMessage = customMessage;
	}
	
	public String getCustomMessage() {
		return customMessage;
	}

}
