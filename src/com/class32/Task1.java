package com.class32;

import java.util.ArrayList;
import java.util.Collections;

//Create an ArrayList of Strings and using Collections class sort the values of that ArrayList.
public class Task1 {

	public static void main(String[] args) {
		
		ArrayList <String> alist=new ArrayList<>();
		alist.add("Rome");
		alist.add("Osaka");
		alist.add("Seoul");
		alist.add("New York");
		alist.add("Tokyo");
		
		System.out.println("ArrayList before sorting"+alist);
		Collections.sort(alist);
		System.out.println("ArrayList after sorting"+alist);
	}

}
