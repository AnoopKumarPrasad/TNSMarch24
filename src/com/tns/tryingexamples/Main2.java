package com.tns.tryingexamples;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello World";
		String s2="Hello World";
		StringBuilder sb1=new StringBuilder();
		sb1.append("Hello").append(" World"); //there is a difference between " W" and "W" of spaces & value
		System.out.println(s1==s2);
		System.out.println(sb1);
		System.out.println(s1.equals(s2));
		System.out.println(sb1.toString()==s2);
		System.out.println(sb1.toString().equals(s1));
		}
}
