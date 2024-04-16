package com.tns.Lambdaparameters;

public class LargestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finder f = (num1,num2)->num1>num2?num1:num2;
		int res= f.max(10,20);
		System.out.println(res);
	}

}
