package com.core.spring_core.scope;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeBeanMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ScopeBean.xml");
		System.out.println("Singleton");
		ScopeBean scopeBean=(ScopeBean) context.getBean("scopeBean");
		scopeBean.setMessage("Hi-Singleton");
		System.out.println(scopeBean.hashCode());
		System.out.println(scopeBean.getMessage());
		ScopeBean scopeBean1=(ScopeBean) context.getBean("scopeBean");
		System.out.println(scopeBean1.hashCode());
		System.out.println(scopeBean1.getMessage());
		
		System.out.println("Prototype");
		ScopeBean scopeBean2=(ScopeBean) context.getBean("scopeBeanProto");
		scopeBean2.setMessage("Hi-prototype");
		System.out.println(scopeBean2.hashCode());
		System.out.println(scopeBean2.getMessage());
		ScopeBean scopeBean3=(ScopeBean) context.getBean("scopeBeanProto");
		System.out.println(scopeBean3.hashCode());
		System.out.println(scopeBean3.getMessage());
		
	}
	
}
