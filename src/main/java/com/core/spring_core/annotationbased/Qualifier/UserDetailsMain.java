package com.core.spring_core.annotationbased.Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDetailsMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("QualifierAnnotation.xml");
		UserDetails userDetails = (UserDetails) context.getBean("userDetails");
		userDetails.userDetails();
	}

}
