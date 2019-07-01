package com.core.spring_core.di.javabased.configuration;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClaintMain {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(DataSourceConfig.class);
	context.getBean(Client.class).myClintDatabaseBean();
	
}
}
