package com.tns.Abstraction;

public class Car extends Vehicle {
	private String vehicleType;
	
	Car(String vehicleType) {
		this.vehicleType = vehicleType;
		
	}
	@Override
	void call(){
	setVehicleName("Car");
	infor();
	
}
 private void infor() {
	 System.out.println("Vehicle Type is:" + vehicleType);
 }

}
