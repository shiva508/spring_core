package com.core.spring_core.di.javabased.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
	@Bean
	public DataSourceBean dataSourceBean() {
		return new DataSourceBean();
	}
	@Bean
	public Client client() {
		return new Client(dataSourceBean());
	}
}
