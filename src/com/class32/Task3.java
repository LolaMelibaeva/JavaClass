package com.class32;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/*Create an HashSet of cities and add duplicates into it.
    Retrieve all values from hashset in 2 different ways.
    Retrieve all values in alphabetical order.*/
public class Task3 {

	public static void main(String[] args) {
		
		HashSet<String> city=new HashSet<>();
		city.add("Paris");
		city.add("Rome");
		city.add("Minsk");
		city.add("Osaka");
		city.add("Cairo");
		city.add("Rome");
		city.add("Osaka");
		
		System.out.println("Original HashSet "+city);

        // Sorting HashSet using List 
        List<String> list = new ArrayList<String>(city); 
        Collections.sort(list); 
  
        // Print the sorted elements of the HashSet 
        System.out.println("HashSet elements "
                           + "in sorted order "
                           + "using List: "
                           + list);
		
		Iterator cities=city.iterator();
		System.out.print("Retrivieng values using Iterator: ");
		while(cities.hasNext()){
		String cityprint=(String) cities.next();
		
		System.out.print(cityprint+" ");
		}
		
		}
		
	}


