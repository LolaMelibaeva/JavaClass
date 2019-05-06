package com.class34;
import java.util.*;
import java.util.Map.Entry;
public class Task1Cities {
/*1.Create a Map from array of cities that will sort keys in alphabetical order. 
 * As a key store the name of the city and as a value store the length of the city 
 * name (Example: Paris=5, Moscow =6 etc..).
If any city name is more than 7 characters remove that city ( use entrySet with Iterator ).*/
	
	public static void main(String[] args) {
		
          String[] city= {"Paris","Moscow", "Washington", "Minsk", "Seoul", "Jakarta"};
		
		Map< String, Integer> cityMap=new TreeMap<>();
		
		 for (String num : city) {
	            if (num.length() < 7) {
	                cityMap.put(num, num.length());
	            }
	        }

	      

	        Iterator<Map.Entry<String, Integer>> it = cityMap.entrySet().iterator();
	        while (it.hasNext()) {
	            Map.Entry entry = it.next();
	            System.out.print(entry.getKey() + " : " + entry.getValue()+" ");
	        }
	}
}
	            
	            
	            