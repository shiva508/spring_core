package com.core.spring_core.injection.constructorbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.core.spring_core.injection.IndianMovies;
import com.core.spring_core.injection.Movies;

@Configuration
public class ConstructorBasedClient {
	@Bean
	public Movies movies() {
		return new IndianMovies();
	}

	@Bean
	public ConstructorMovies constructorMovies() {
		return new ConstructorMovies(movies());
	}

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConstructorBasedClient.class);
		context.getBean(ConstructorMovies.class).movies("Hollywood");
	}
}
