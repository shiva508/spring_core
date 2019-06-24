package com.core.spring_core.autowiring.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireByTypeBankMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AutoWireByType.xml");
		BankByTypeService typeService=(BankByTypeService) context.getBean("bankByTypeService");
		System.out.println(typeService.getBanks());
	}
}
