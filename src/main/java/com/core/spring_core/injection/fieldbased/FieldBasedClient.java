package com.core.spring_core.injection.fieldbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.core.spring_core.injection.IndianMovies;
import com.core.spring_core.injection.Movies;

@Configuration
public class FieldBasedClient {
	@Bean
	public Movies movies() {
		return new IndianMovies();
	}

	@Bean
	public FieldMovies fieldMovies() {
		return new FieldMovies();
	}

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(FieldBasedClient.class);
		context.getBean(FieldMovies.class).movies("Maniratnam Movies world");
	}
}
