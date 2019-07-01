package com.core.spring_core.annotation.BEAN;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PhoneConfig {
	@Bean(initMethod = "start",destroyMethod = "end")
	public Phone phone() {
		return new Phone();
	}
}
