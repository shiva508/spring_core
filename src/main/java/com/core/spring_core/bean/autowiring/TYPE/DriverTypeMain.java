package com.core.spring_core.bean.autowiring.TYPE;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DriverTypeMain {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DriverTypeConfig.class);
	context.getBean(DriverType.class).driveVehicle();
}
}
