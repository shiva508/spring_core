package com.core.spring_core.listener.custom.impl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuildInListenerBasedExample {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BuildInListenerBasedBean.class);	
	}
	
}
