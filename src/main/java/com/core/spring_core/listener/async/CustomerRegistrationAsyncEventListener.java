package com.core.spring_core.listener.async;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.core.spring_core.listener.custom.CustomerRegistrationEvent;

@Component
public class CustomerRegistrationAsyncEventListener {
	@Async
	@EventListener
    void handleRegistration(CustomerRegistrationEvent event){
        System.out.println("Registration event got triggered for customer::  " + event.getName());
    }
}
