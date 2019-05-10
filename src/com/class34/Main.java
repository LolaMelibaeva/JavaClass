package com.class34;
import java.util.*;


	class Main {
	  public static void print(Map<String, Integer> map)  {
		  
	       if(!map.isEmpty()) {
	    	   System.out.println(map);
	       }else {
	    	   System.out.println("map is empty");
	       }
	     }
	  public static void main(String[] args) {
	    
	    Map<String, Integer> map=new HashMap <String, Integer>();
	    map.put("mango", 10); 
		   map.put("apple", 30); 
		   map.put("orange", 20);
	     
	     print(map);
	     map.clear();
	     print(map);
	  }
	}