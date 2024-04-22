package com.tns.tryingexamples;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a");
		try {
			System.out.println("b");
			throw new IllegalArgumentException();
		}
		catch(RuntimeException e)
		{
			System.out.println("c");
		}
		finally {
			System.out.println("d");
		}
	}

}
