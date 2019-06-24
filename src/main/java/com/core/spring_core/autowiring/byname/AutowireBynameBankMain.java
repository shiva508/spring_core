package com.core.spring_core.autowiring.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireBynameBankMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AutoWireByName.xml");
		BankByNameService bankByNameService=(BankByNameService) context.getBean("bankByNameService");
		System.out.println(bankByNameService.getBanks());
	}

}
