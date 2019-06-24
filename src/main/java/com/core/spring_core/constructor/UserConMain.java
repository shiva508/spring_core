package com.core.spring_core.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserConMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("UserCon.xml");
		UserCon userCon=(UserCon) context.getBean("userCon");
		System.out.println(userCon.toString());
	}

}
