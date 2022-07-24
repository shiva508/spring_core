package com.core.spring_core.injection.setterbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.core.spring_core.injection.IndianMovies;
import com.core.spring_core.injection.Movies;

@Configuration
public class SetterBasedClient {

	@Bean
	public Movies movies() {
		return new IndianMovies();
	}

	@Bean
	public SetterMovies setterMovies() {
		SetterMovies setterMovies = new SetterMovies();
		return setterMovies;
	}
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SetterBasedClient.class);
		context.getBean(SetterMovies.class).movies("Indiam Movied");
	}

}
