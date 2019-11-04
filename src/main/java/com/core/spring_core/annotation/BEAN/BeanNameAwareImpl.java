package com.core.spring_core.annotation.BEAN;

import org.springframework.beans.factory.BeanNameAware;

public class BeanNameAwareImpl implements BeanNameAware {

	public void setBeanName(String name) {
		System.out.println(name);

	}

}
