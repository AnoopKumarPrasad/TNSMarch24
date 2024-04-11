package com.tns.solveThrow;

public class ThrowProgram {

	public static void validate(int age) 
	{
		if (age < 18) {
			throw new ArithmeticException("invalid age");
		}
		else {
			System.out.println("valid age");
		}
	}
}
