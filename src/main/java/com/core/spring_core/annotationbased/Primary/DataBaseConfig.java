package com.core.spring_core.annotationbased.Primary;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DataBaseConfig {
	@Bean(autowire = Autowire.BY_TYPE)
	public DatabaseService databaseService() {
		return new DatabaseService();
	}
	@Bean
	@Primary
	public Dao daoMySql() {
		return new DaoMySql();
	}
	@Bean
	public Dao daoOracle() {
		return new DaoOracle();
	}
	
}
