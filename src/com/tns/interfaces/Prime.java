package com.tns.interfaces;

public class Prime implements Amazon {


	@Override
	public void welcome() {
		System.out.println("Welcome to prime account");
		
	}

	@Override
	public void subscribe() {
		System.out.println("Thank you for subscribing");
	}

}
