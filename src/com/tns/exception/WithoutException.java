package com.tns.exception;

public class WithoutException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d =0;
		try
		{
		int a =42/d; //exception occured
		System.out.println("Hello Everyone");
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Exception is caught "+e);
		}
		catch(ArrayIndexOutOfBoundsException ob)
		{
			System.out.println("exception is caught"+ob.getMessage());
		}
		catch(NullPointerException nob)
		{
			System.out.println("exception is caught"+nob.getMessage());
		}
		catch(Exception ob)
		{
			System.out.println("Since no matching exception I will handle");
			System.out.println("exception is caught"+ob.getMessage()); //getMessage is more specific and only ob is a broad term 
		}		
		finally
		{
			System.out.println("This will print for sure");
		}
	}
}