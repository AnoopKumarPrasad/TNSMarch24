package com.tns.interfaces;

public class Demo {

	public static void main(String[] args) {
		
		Amazon.aboutUs();
		Amazon a;
		a= new Prime();
		a.welcome();
		a.subscribe();
		
		a= new NonPrime();
		a.welcome();
		a.serviceCharge();
		a.subscribe();
	}
}
