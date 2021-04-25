package com.core.spring_core.listener.custom;

import org.springframework.context.event.EventListener;

public class CustomEventListnerBean {
	@EventListener
	public void customHandler(CustomEvent customEvent) {
		System.out.print("event received: " + customEvent.getCustomMessage());
		System.out.println(" -- source: " + customEvent.getSource());
	}
}
