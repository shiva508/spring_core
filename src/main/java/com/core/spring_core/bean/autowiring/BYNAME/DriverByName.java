package com.core.spring_core.bean.autowiring.BYNAME;

import org.springframework.beans.factory.annotation.Autowired;

import com.core.spring_core.bean.autowiring.Vehicle;

public class DriverByName {
	@Autowired
	private Vehicle war;
	public void driveVehicle() {
		System.out.println("I CAN DRIVE " + war.getVehicleName());
	}
}
