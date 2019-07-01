package com.core.spring_core.di.javabased.configuration1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.core.spring_core.di.javabased.configuration.Client;
import com.core.spring_core.di.javabased.configuration.DataSourceConfig;

@Configuration
public class ClientConfig {
	@Autowired
	private DataSourceConfig dataSourceConfig;
	@Bean
	@Qualifier
	public Client clientsd() {
		return new Client(dataSourceConfig.dataSourceBean());
	}

}
