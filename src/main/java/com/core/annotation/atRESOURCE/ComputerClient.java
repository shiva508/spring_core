package com.core.annotation.atRESOURCE;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComputerClient {

	@Bean(name = "dellComputer")
	public Computer dellComputer() {
		return new DellComputer();
	}

	@Bean(name = "accerComputer")
	public Computer accerComputer() {
		return new AccerComputer();
	}

	@Bean(name = "lenevoComputer")
	public Computer lenevoComputer() {
		return new LenevoComputer();
	}

	@Bean
	public ComputerHub computerHub() {
		return new ComputerHub();
	}

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ComputerClient.class);
		context.getBean(ComputerHub.class).writeProgram("JAVA");
	}
}
