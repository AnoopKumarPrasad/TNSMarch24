package com.tns.generics;

public class GenericDemo { //Generics are used to pass different datatypes

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//generic example class work for string
	GenericExample <String>sobj = new GenericExample<String>();
	sobj.add("hello");
	System.out.println(sobj.get());
	
	GenericExample <Integer> Iobj = new GenericExample<Integer>();
	Iobj.add(22);
	System.out.println(Iobj.get());
	
	GenericExample <Double> Dobj = new GenericExample<Double>();
	Dobj.add(6.6);
	System.out.println(Dobj.get());
	
	}
}