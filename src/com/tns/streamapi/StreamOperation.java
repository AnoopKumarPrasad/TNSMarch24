package com.tns.streamapi;

import java.util.stream.Stream;

public class StreamOperation {

	void allOperation() {
		//using of method to create a stream
		Stream <Integer> st=Stream.of(10,20,30,40);
		//foreach is a terminal operation after this no operation is required
		
		st.forEach(e->System.out.println(e));
		
//two terminal operations can't be handled with one stream, another stream is required for different terminal operations
	
		//System.out.println(st.count());
		
	}
}
