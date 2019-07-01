package com.core.spring_core.annotationbased.Primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages = {"com.core.spring_core.annotationbased.Primary"})
public class MainDatabase {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(DataBaseConfig.class);
	context.getBean(DatabaseService.class).getDatabaseService();
}
}
