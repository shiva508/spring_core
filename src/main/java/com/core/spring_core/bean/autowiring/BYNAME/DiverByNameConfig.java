package com.core.spring_core.bean.autowiring.BYNAME;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.core.spring_core.bean.autowiring.Vehicle;

@Configuration
public class DiverByNameConfig {
	@Bean(autowire = Autowire.BY_NAME)
	public DriverByName driverByNam() {
		return new DriverByName();
	}
	@Bean(name = "war")
	public Vehicle car() {
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("CAR");
		return vehicle;
	}
	@Bean
	public Vehicle lorry() {
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("LORRY");
		return vehicle;
	}
	
}
