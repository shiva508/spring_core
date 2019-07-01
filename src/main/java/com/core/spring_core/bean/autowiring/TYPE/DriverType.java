package com.core.spring_core.bean.autowiring.TYPE;

import com.core.spring_core.bean.autowiring.Vehicle;

public class DriverType {
private Vehicle vehicle;

public void setVehicle(Vehicle vehicle) {
	this.vehicle = vehicle;
}
public void driveVehicle() {

	System.out.println("I CAN DRIVE " + vehicle.getVehicleName());
}
}
