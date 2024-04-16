package com.tns.LambdaFactorialExp;


public class FactorialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factorial fact=(x)->{
			int result =1;
			for(int i=1;i<=x;i++) 
				{ 
				result=result*i;
				}
				return result; };
			int res = fact.facto(5);
		System.out.println(res);
		}
}