package com.core.spring_core.scope;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class CustomScopedPostProcessor implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		
		for (String beanName:beanFactory.getBeanDefinitionNames()) {
			BeanDefinition beanDefinition=beanFactory.getBeanDefinition(beanName);
			beanDefinition.setScope("prototype");
		}
	}

}
