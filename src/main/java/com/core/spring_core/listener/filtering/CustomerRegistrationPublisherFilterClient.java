package com.core.spring_core.listener.filtering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.core.spring_core.listener.custom.CustomerRegistrationEvent;
import com.core.spring_core.listener.custom.CustomerRegistrationEventListener;

//@Configuration
public class CustomerRegistrationPublisherFilterClient {
	@Autowired
	private CustomerRegistrationEventFilteringListener customerRegistrationEventFilteringListener;
	@Autowired
	private CustomerRegistrationPublisherFilterBean customerRegistrationPublisherFilterBean;
	
	
	
	 
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CustomerRegistrationPublisherFilterClient.class);
		context.getBean(CustomerRegistrationEventFilteringListener.class).handleRegistration(new CustomerRegistrationEvent("Hellow Prends Who are yoo"));
	}
	
}
