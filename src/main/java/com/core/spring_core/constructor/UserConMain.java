package com.core.spring_core.constructor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class UserConMain {
	public static void main(String[] args) throws FileNotFoundException {
		
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("UserCon.xml"));
		//ApplicationContext context=new ClassPathXmlApplicationContext("UserCon.xml");
		UserCon userCon=(UserCon) beanFactory.getBean("userCon");
		System.out.println(userCon.toString());
	}

}
