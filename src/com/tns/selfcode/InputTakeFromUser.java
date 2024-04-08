package com.tns.selfcode;

import java.util.Scanner;

public class InputTakeFromUser {

	public static void main(String[] args) {
		
		System.out.println("Enter number of values you want to enter");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//creating an array to store user entered values
		int values[] = new int[n];
		
		System.out.println("Enter the desired values");
		for(int i=0;i<n;i++){
		   values[i] = sc.nextInt();
		}

		System.out.println("Your entered values are: ");
		for(int j=0;j<n;j++){
		   System.out.print(" "+values[j]); //println is changed and " " is added 
		}
	}
}
