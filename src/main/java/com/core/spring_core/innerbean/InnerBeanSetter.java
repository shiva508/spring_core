package com.core.spring_core.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBeanSetter {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("InnerBeans.xml");
		Dependent dependent=(Dependent) context.getBean("dependent");
		dependent.dependentProcessor();
		
		DependentConstructor constructor=(DependentConstructor) context.getBean("dependentCon");
		constructor.dependentProcessor();
	}

}
