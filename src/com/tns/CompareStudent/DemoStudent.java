package com.tns.CompareStudent;

import java.util.ArrayList;
import java.util.Collections;

public class DemoStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stu = new ArrayList<Student>();
		stu.add(new Student (2, "Anil", "Pune"));
		stu.add(new Student (3, "Kapil", "Mumbai"));
		stu.add(new Student (1, "Bhabn", "Kolkata"));
		
		System.out.println("Comparing by Roll Numbers");
		SortRollNum sortRoll = new SortRollNum();
		Collections.sort(stu, sortRoll);
		for (Student student : stu) {
			System.out.println(student);
		}
		
		System.out.println("Comparing by Names");
		SortName sortname = new SortName();
		Collections.sort(stu, sortname);
		for (Student student:stu) {
			System.out.println(student);
		}
	}
}
