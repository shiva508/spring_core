package com.core.annotation.atIMPORT;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticSearchConfiguration {
	@Bean
	public ElasticSearchInstance elasticSearchInstance() {
		return new ElasticSearchInstance();
	}
}
