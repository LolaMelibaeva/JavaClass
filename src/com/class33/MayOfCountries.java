package com.class33;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MayOfCountries {

	public static void main(String[] args) {
	/*Create a map of countries with its capital. 
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.*/
		

		Map<String, String> map=new HashMap<>();
		map.put("Japan", "Tokyo");
		map.put("Belarus", "Minsk");
		map.put("South Korea", "Seoul");
		map.put("Indonesia", "Jakarta");
		map.put("India", "Delhi");
		
		System.out.println(map);
		System.out.println("-----------------");
		System.out.println("Printing Countries using for each loop ");
		System.out.println();
		Set <String> keys=map.keySet();
		
		for (String key: keys) {
			System.out.print(key+" ");
		}
		System.out.println();
		System.out.println("Printing Countries by using Iterator");
		System.out.println();
		Iterator<String> keysCap=keys.iterator();
		while(keysCap.hasNext()) {
			String key=keysCap.next();
			System.out.print(key+" ");
		}
		System.out.println();
		System.out.println("----------------------");
		
		System.out.println("Printing Capitals for each loop");
		System.out.println();
		Collection <String > valCap=map.values();
		
		for (String cities: valCap) {
			System.out.print(cities+" ");
		}
		System.out.println();
		System.out.println("Printing Capitals by using Iterator");
		System.out.println();
		
		Iterator<String> itCities=valCap.iterator();
		while(itCities.hasNext()) {
			System.out.print(itCities.next()+" ");
		}
		System.out.println();
	System.out.println("--------------------------");
	System.out.println("Print both Countries and Capitals");
	
	for (String cap: keys) {
		System.out.println(cap+" : " +map.get(cap));
		
			}
	System.out.println("Iterator for both countries and capitals");
	
	Iterator<String> itConCap=keys.iterator();
	while(itConCap.hasNext()) {
		String print=itConCap.next();
		System.out.println(print+" : "+map.get(print));
	}
		
	}
	
	}
	
