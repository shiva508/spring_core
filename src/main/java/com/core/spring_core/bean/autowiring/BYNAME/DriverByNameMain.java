package com.core.spring_core.bean.autowiring.BYNAME;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverByNameMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiverByNameConfig.class);
		context.getBean(DriverByName.class).driveVehicle();
	}
}
