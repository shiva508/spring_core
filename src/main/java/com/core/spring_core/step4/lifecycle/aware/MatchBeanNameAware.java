package com.core.spring_core.step4.lifecycle.aware;

import org.springframework.beans.factory.BeanNameAware;

public class MatchBeanNameAware implements BeanNameAware {

	public void setBeanName(String name) {
		System.out.println("MatchBeanNameAware:" + name);
	}

}
