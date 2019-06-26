package com.core.spring_core.eventhandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("EventHandler.xml");
		context.start();
		Event event = (Event) context.getBean("event");
		event.eventDetails();
		context.stop();
	}

}
