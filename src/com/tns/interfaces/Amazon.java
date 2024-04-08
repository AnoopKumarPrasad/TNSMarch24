package com.tns.interfaces;
//program to demonstrate 
public interface Amazon {
	void welcome();
	void subscribe();//abstract methods
	
	default void serviceCharge() //features introduced after Java 8
	{
		int amt=100;
		System.out.println("The service charge is"+amt);
	}
	static void aboutUs() {
		System.out.println("It is ecommerece website");
	}
	
	
}