package com.tns.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList li = new ArrayList();
		System.out.println("Check the List has elements are not"+ " " +li.isEmpty());
		System.out.println("Check the size of the list"+ " " +li.size());
		li.add(22);
		li.add("hello");
		li.add(44);
		System.out.println("The elements of the list are" + " " + li);
		System.out.println("To check the element is present or not" + " " + li.contains(22));
		System.out.println("Element at the given position" + " " +li.get(2));
		System.out.println("Remove element at the given position" + " " +li.remove(0));
		System.out.println("The elements of the list are" + " " +li);

	//	Collections.sort(li);
		System.out.println("The elements of the list are" + " " +li);
		
		ArrayList <String> ob = new ArrayList();
		ob.add("suma");
		ob.add("ramya");
		ob.add("Priya");
		
		Collections.sort(ob);
		
		Iterator <String> i = ob.iterator();
		while(i.hasNext()) {
			String nm = i.next();
			System.out.println(nm);
		}
	}
}
