package com.tns.solveThrow;

public class UserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Userdefined.validate();
			
		}
		catch(Age e) {
			System.out.println("caught exception");
		}
	}
}
