package com.class32;

import java.lang.reflect.Array;
import java.util.Arrays;

//Create an array of Strings and using Arrays class  class sort the values of that array of Strings.
public class Task2 {

	public static void main(String[] args) {
		
		
		String [] fruits= {"apple","pear", "banana","orange","plum"};
		System.out.println("Array before sorting: ");
		for (String fruta: fruits) {
		
		System.out.print(fruta+" ");}
		System.out.println();
		
		
		Arrays.sort(fruits);
		System.out.println("Array after sorting: ");
		for(String fruit:fruits) {
			System.out.print(fruit+" ");
		}
		
	}

}
