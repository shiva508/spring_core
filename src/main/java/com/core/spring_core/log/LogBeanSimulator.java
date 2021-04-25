package com.core.spring_core.log;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogBeanSimulator {

	@Bean
	public LogBean logBean() {
		return new LogBean();
	}
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(LogBeanSimulator.class);
		context.getBean(LogBean.class).logDetails();
	}

}
