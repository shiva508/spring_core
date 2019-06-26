package com.core.spring_core.autowiring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireByConstructorBankMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AutoWireByConstructor.xml");
		BankByConstructorService service=(BankByConstructorService) context.getBean("bankByConstructorService");
		System.out.println(service.getBanks());
	}
}

