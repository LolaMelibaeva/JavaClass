package com.class34;
import java.util.*;
public class Test {
	 public static void main(String[] args) {
	        Map<String, Market> sales = new HashMap<String, Market>();

	        sales.put("Joe", new Market("Joe", "Shoes", 2000.00));
	        sales.put("Smith", new Market("Smith", "Shoes", 4000.00));
	        sales.put("Adam", new Market("Adam", "Shoes", 6000.00));
	        sales.put("Tiffany", new Market("Tiffany", "Shoes", 7000.00));
	        sales.put("Aloha", new Market("Aloha", "Shoes", 1000.00));
	        sales.put("Sam", new Market("Sam", "Shoes", 10000.00));
	        sales.put("Mustafa", new Market("Mustafa", "Shoes", 50000.00));
	        sales.put("Kelda", new Market("Kelda", "Shoes", 3000.00));

	        for (String key : sales.keySet()) {

	            Market m = sales.get(key);

	            if (m.getSaleAmount() > 3000)
	                System.out.println(m.toString());
	        }

	    }

	}
