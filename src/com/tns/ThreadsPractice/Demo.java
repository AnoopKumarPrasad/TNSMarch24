package com.tns.ThreadsPractice;

public class Demo {

	public static void main(String[] args) {
	A obj1 = new A();
	B obj2 = new B();
	
	obj1.start();
	obj2.start();
}
}