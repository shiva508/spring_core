package com.core.spring_core.step4.lifecycle.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class MatchBeanFactoryAware implements BeanFactoryAware {

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("isPrototype: "+beanFactory.isPrototype("oneDayMatch"));
		System.out.println("MatchBeanFactoryAware: Factory is called");
	}

}
