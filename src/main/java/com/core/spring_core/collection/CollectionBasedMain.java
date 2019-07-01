package com.core.spring_core.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionBasedMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("CollectionBased.xml");
		CollectionBased collectionBased=(CollectionBased) context.getBean("javaCollection");
		System.out.println(collectionBased.getBankList());
		System.out.println(collectionBased.getBankMap());
		System.out.println(collectionBased.getBankProperties());
		System.out.println(collectionBased.getBankSet());
		System.out.println(collectionBased.getAccoumntMap());
	}

}
