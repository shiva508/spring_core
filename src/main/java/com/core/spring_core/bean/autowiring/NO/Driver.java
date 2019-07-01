package com.core.spring_core.bean.autowiring.NO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.core.spring_core.bean.autowiring.Vehicle;

public class Driver {
	@Autowired
	@Qualifier("lorry")
	private Vehicle vehicle;

	public void driveVehicle() {

		System.out.println("I CAN DRIVE " + vehicle.getVehicleName());
	}
}
