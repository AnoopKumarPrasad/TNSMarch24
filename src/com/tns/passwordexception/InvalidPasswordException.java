package com.tns.passwordexception;

public class InvalidPasswordException extends Exception {

	InvalidPasswordException(String password)
	{
		System.out.println(password);
	}
}
