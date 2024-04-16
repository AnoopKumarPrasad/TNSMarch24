package com.tns.generics;

public class GenericMethod {

	public <T>void displayArrayElements(T[]elements) {
		for(T ele:elements) {
			System.out.println("Element is" + ele);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	GenericMethod obj = new GenericMethod();
	Integer[] intarry= {10,20,30,40};
	String[] str = {"hello","hai"};
	obj.displayArrayElements(intarry);
	obj.displayArrayElements(str);
	}

}
