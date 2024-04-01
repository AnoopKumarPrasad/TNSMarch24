package com.tns.Abstraction;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Vehicle v;
		
		v = new Bike("Wego");
		v.call();
		v.show();
		
		v = new Car("Nexon");
		v.call();
		v.show();
		}
}
