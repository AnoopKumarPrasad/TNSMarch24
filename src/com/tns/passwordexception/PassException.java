package com.tns.passwordexception;

import java.util.Scanner;

public class PassException {
	private static String password;
	static void isValid() throws InvalidPasswordException {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Password");
	password = sc.next();
		{
		if((password.contains("@") || password.contains("#") 
	              || password.contains("!") || password.contains("~") 
	              || password.contains("$") || password.contains("%") 
	              || password.contains("^") || password.contains("&") 
	              || password.contains("*") || password.contains("(") 
	              || password.contains(")") || password.contains("-") 
	              || password.contains("+") || password.contains("/") 
	              || password.contains(":") || password.contains(".") 
	              || password.contains(", ") || password.contains("<") 
	              || password.contains(">") || password.contains("?") 
	              || password.contains("|")))
				{
			throw new InvalidPasswordException("Invalid Password");
				}
		else
		{
			System.out.println("Password is Valid");
		}
		}
	}}
