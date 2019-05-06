package com.class33;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {

	public static void main(String[] args) {
		//Map<Key, Value>
		Map<Integer, String> map=new HashMap<>();
		map.put(101, "John");
		map.put(102, "Jane");
		map.put(103, "Kate");
		map.put(104, "James");
		
		//to retrieve or access values;
		
		System.out.println(map.get(102));
		// how to find size of a map
		
		System.out.println("Size of the map is: " +map.size());
		
		//how to update the value
		map.replace(103, "Bilal");
		System.out.println("The replaced value: "+ map.get(103));
		
		//how to remove the value
		
		map.remove(104);
		System.out.println("New size of a map: "+map.size());
		
		//how to check if there are any values in the map
		
		System.out.println("Is map empty: "+map.isEmpty());
		System.out.println(map);
		
		
		
		
		System.out.println(map.containsValue("Bilal"));

		map.put(105, "Jane");
		System.out.println(map);
		map.put(101, "Shaban");
		System.out.println(map);
		//adding null key with some value
		map.put(null, "Some value");
		System.out.println(map);
		//adding null key with null value
		map.put(null, null);
		System.out.println(map);
	}
}
		
		
