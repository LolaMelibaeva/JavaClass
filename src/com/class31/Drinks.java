package com.class31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Drinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> drinks=new ArrayList<String>(Arrays.asList("Cola","Yogurt", "Tea", "Kambucha","Milk"));

		for (int i=0; i<drinks.size(); i++) {
			String drink=drinks.get(i);
			
		if (drink.contains("e") || drink.contains("a")) {
				drinks.set(i,"water");
			}
				
		}
		System.out.println(drinks);
	}

}
