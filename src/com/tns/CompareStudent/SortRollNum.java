package com.tns.CompareStudent;

import java.util.Comparator;

public class SortRollNum implements Comparator<Student> {
	
	public int compare(Student o1, Student o2)
	{
		return o1.rollNo-o2.rollNo;
	}

}
