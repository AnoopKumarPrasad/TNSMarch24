package com.tns.Abstraction;

public class Bike extends Vehicle {
	private String vehicleType;
	
	Bike(String vehicleType) {
		this.vehicleType = vehicleType;
		
	}
	@Override
	void call(){
	setVehicleName("Bike");
	infor();
	
}
 private void infor() {
	 System.out.println("Vehicle Type is:" + vehicleType);
 }
}
