package com.tns.Lambdaexp;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithParameters ob=(x)->{return (x*x*x) ;};
		System.out.println(ob.cube(5));
	}
}
