package com.tns.Abstraction;


abstract class Vehicle {
	private String vehicleName;
	
	abstract void call();
	
	void show() {
		System.out.println("You are riding " + vehicleName + " vehicle");
		System.out.println("----------Keep Riding Safe------------");
	}

	void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
		
	}

}
