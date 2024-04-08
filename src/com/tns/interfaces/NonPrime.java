package com.tns.interfaces;

public class NonPrime implements Amazon {

	@Override
	public void welcome() {
		System.out.println("Welcome to non-prime account");
	}

	@Override
	public void subscribe() {
		System.out.println("Thank you for subscribing");
	}

}
