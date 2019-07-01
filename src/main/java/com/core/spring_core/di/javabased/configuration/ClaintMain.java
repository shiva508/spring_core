package com.core.spring_core.di.javabased.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.core.spring_core.di.javabased.configuration1.ClientConfig;

public class ClaintMain {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(DataSourceConfig.class,ClientConfig.class);
	DataSourceBean dataSourceBean=	context.getBean(DataSourceBean.class);
	dataSourceBean.myDatabaseInstance();
	
	context.getBean(Client.class).myClintDatabaseBean();
	
}
}
