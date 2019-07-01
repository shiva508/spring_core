package com.core.spring_core.bean.autowiring.TYPE;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.core.spring_core.bean.autowiring.Vehicle;

@Configuration
public class DriverTypeConfig {
	@Bean(autowire = Autowire.BY_TYPE)
	public DriverType driverType() {
		return new DriverType();
	}
	@Bean
	public Vehicle car() {
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("CAR");
		return vehicle;
	}
}
