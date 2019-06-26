package com.core.spring_core.annotationbased.JSR250;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DevilMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Jsr250.xml");
		Devil devil = (Devil) context.getBean("devil");
		System.out.println(devil.getName());
		context.registerShutdownHook();
	}

}
