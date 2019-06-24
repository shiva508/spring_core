package com.core.spring_core.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserSetterMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("UserSetter.xml");
		User user = (User) context.getBean("user");
		System.out.println(user.toString());
	}
}
