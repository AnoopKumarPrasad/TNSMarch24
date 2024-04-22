package com.tns.tryingexamples;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = new String("Hello");
		System.out.println(str1 == str2); //== operator in Java compares the references of two objects
		System.out.println(str1.equals(str2)); //equals operator comapares the values of the strings

	}

}
