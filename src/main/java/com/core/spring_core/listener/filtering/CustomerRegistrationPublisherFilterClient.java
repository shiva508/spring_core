package com.core.spring_core.listener.filtering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.core.spring_core.listener.custom.CustomerRegistrationEvent;
import com.core.spring_core.listener.custom.CustomerRegistrationEventListener;

//@Configuration
public class CustomerRegistrationPublisherFilterClient {
	@Autowired
	 CustomerRegistrationEventFilteringListener filteringListener;
	@Autowired
	 CustomerRegistrationPublisherFilterBean publisherFilterBean;
	@Bean(name = "eventFilteringListener")
	public CustomerRegistrationEventFilteringListener eventFilteringListener() {
		return new CustomerRegistrationEventFilteringListener();
	}
	@Bean(name = "publisherFilterBean")
	public CustomerRegistrationPublisherFilterBean publisherFilterBean() {
		return new CustomerRegistrationPublisherFilterBean();
	}
	 
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CustomerRegistrationPublisherFilterClient.class);
		((CustomerRegistrationEventFilteringListener) context.getBean("eventFilteringListener")).handleRegistration(new CustomerRegistrationEvent("Hellow Prends Who are yoo"));
	}
	
}
