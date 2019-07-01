package com.core.spring_core.annotation.BEAN;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PhoneConfig.class);
		context.getBean(Phone.class).sendMessage();
		context.close();
	}
}
