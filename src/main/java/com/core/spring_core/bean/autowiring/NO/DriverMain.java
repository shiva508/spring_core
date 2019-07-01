package com.core.spring_core.bean.autowiring.NO;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiverConfig.class);
		context.getBean(Driver.class).driveVehicle();
	}
}
