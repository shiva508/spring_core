package com.core.spring_core.listener.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerRegistrationClient {
	@Autowired
	private CustomerRegistrationPublisherBean publisherBean;
	@Autowired
	private  CustomerRegistrationEventListener eventListener;

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CustomerRegistrationEventListener.class);
		context.getBean(CustomerRegistrationEventListener.class).handleRegistration(new CustomerRegistrationEvent("Hellow Prends Who are yoo"));
	}
}
