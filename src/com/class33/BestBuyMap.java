package com.class33;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class BestBuyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Print all keys and values from a Best Buy map using EntrySet.*/
		
		Map <Integer, String> item=new LinkedHashMap<>();
		item.put(7664847, "Printer");
		item.put(7879885, "TV");
		item.put(7879886, "Laptop");
		item.put(7879887, "Camera");
		item.put(7879888, "GPS");
		
		System.out.println(item);
		System.out.println("Printing using for each loop");
		System.out.println();
		
		for(Map.Entry<Integer, String> entry: item.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
			
		}
		System.out.println("Printing using iterator");
		System.out.println();
		Iterator<Map.Entry<Integer, String>> items=item.entrySet().iterator();
		while(items.hasNext()) {
			Map.Entry<Integer, String> entry=items.next();
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
	}

}
