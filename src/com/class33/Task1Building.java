package com.class33;

import java.util.HashMap;
import java.util.Map;

public class Task1Building {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		
		map.put(1, "Google");
		map.put(1,"Syntax");
		map.put(2,"Microsoft");
		map.put(3, "Microsoft");
		map.put(4, "Dell");
		map.put(5, "Oracle");
		map.put(6,"RedHat");
		map.put(7, "Facebook");
		
	 System.out.println("The size of the map is: "+map.size());	
	 map.replace(4, "Apple");
	 System.out.println("Replaced 4th entry is: "+map.get(4));
	map.remove(7);
	 System.out.println("Remove the company on the 7th floor:"+ map);
	 System.out.println(map);
	}

}
