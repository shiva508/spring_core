package com.core.annotation.atIMPORT;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ElasticSearchConfiguration.class)
public class UserDetailsSearchClient {
	@Bean
	public ElasticSearchClient elasticSearchClient() {
		return new ElasticSearchClient();
	}

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(UserDetailsSearchClient.class);
		context.getBean(ElasticSearchClient.class).getUserDetaisOnSeartch();
	}
}
