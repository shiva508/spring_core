package com.core.spring_core.bean.autowiring.NO;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.core.spring_core.bean.autowiring.Vehicle;

@Configuration
public class DiverConfig {
	@Bean(autowire = Autowire.NO)
	public Driver driver() {
		return new Driver();
	}
	@Bean
	@Qualifier("car")
	public Vehicle car() {
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("CAR");
		return vehicle;
	}
	@Bean
	@Qualifier("lorry")
	public Vehicle lorry() {
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("LORRY");
		return vehicle;
	}

}
