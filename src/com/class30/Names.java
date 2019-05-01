package com.class30;

import java.util.ArrayList;

/*Create a generic ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that*/

public class Names {
	public static void main(String[] args) {
		
	
	
	ArrayList<String> names=new ArrayList<String>();
	names.add("John");
	names.add("Lisa");
	names.add("Ken");
	names.add("Jack");
	names.add("Jill");
	
	System.out.println(names.isEmpty());
	System.out.println(names.contains("Lisa"));
	System.out.println(names.size());
	
	for (String abd:names) {
		System.out.println(abd);
	}
	
	

}
}