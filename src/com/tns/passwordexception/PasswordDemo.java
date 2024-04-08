package com.tns.passwordexception;

public class PasswordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PassException.isValid();	
		}
		catch(InvalidPasswordException e) {
			System.out.println("caught exception");
		}
	}

}
