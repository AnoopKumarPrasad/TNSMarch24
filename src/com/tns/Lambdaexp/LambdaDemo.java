package com.tns.Lambdaexp;

public class LambdaDemo {

	public static void main(String[] args) {
			Message m=()->{return "hello";};
			System.out.println(m.greet());
		}

	}
