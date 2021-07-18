package com.core.spring_core.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingLattitude {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean_aware_application.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}
}
