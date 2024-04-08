package com.tns.solve;

import java.util.Scanner;

public class Userdefined {
	private static int age;
	static void validate() throws Age { //Age is userdefined exception
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		age = sc.nextInt();
		if (age<18)
			throw new Age("invalid age");
	else
	{
		System.out.println("valid age");
	}
	}
}

