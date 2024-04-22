package com.tns.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOperations {
	void allOperations() {
		//direct way of creating stream
		Stream<Integer> st1=Stream.of(10,30);

		//created an integer array which is the source
		Integer[] values = new Integer[] {1,2,8,10,20,30,40};
		//creating a stream by using stream method
		Stream<Integer>st2= Arrays.stream(values);
		
		//limit is an intermediate operation
		System.out.println("The first 2 numbers in the array are");
		Arrays.stream(values).limit(2).forEach(System.out::println);
		
		//skip
		System.out.println("skip first 2 nos . in the array are");
		Arrays.stream(values).skip(2).forEach(System.out::println);
		
		//map
		System.out.println("The square of the numbers are:");
		st2.map(num->num*num).forEach(System.out::println);
		
		//for next operations (original stream is affected so new stream is created)
		Stream<Integer>st3= Arrays.stream(values);
		
		//filter the number which are greater than 5 
		System.out.println("Numbers shown are greater than 5");
		st3.filter(num->num>5).forEach(System.out::println);
	}

}
