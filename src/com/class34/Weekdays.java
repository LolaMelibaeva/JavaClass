package com.class34;
import java.util.*;
public class Weekdays {

	public static void main(String[] args) {
		/** Store the following key value pairs in a Map and
        *
        * (Sun,1), (Tue, 2), (Wed, 3), (Thu, 4), (Fri,5), (Sun,7)
        *
        * Write program to test if the map contains a mapping for the specified key(6).
        *
        *
        */
		
		Map<String, Integer> days=new HashMap<>();
		days.put("Sun", 1);
		days.put("Tue", 2);
		days.put("Wed", 3);
		days.put("Thu", 4);
		days.put("Fri", 5);
		days.put("Sun", 7);
		
	//	if(days.containsValue(6)) {
	//		System.out.println(days);
	//	}else {
	//		System.out.println("The days collection does not contain specified key 6");
	//	}
		
		boolean flag=false;
		
		for (Integer key: days.values()) {
			if(key==6) {
				flag=true;
			}
		}
		System.out.println(flag);
	}

}
