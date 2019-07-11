package com.core.spring_core.annotation.BEAN;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;

public class BeanMain {

	public static void main(String[] args) throws FileNotFoundException {
		InputStream input = new FileInputStream("beans.xml");
		BeanFactory beanFactory=new XmlBeanFactory((Resource) input);
				
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PhoneConfig.class);
		context.getBean(Phone.class).sendMessage();
		context.close();
	}
}
