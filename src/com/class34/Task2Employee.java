package com.class34;
import java.util.*;
public class Task2Employee {

	public static void main(String[] args) {
		
		
		Map<String, Integer> employee=new HashMap<>();
		
		employee.put("John Smith", 100000);
		employee.put("Jack Brown", 90000);
		employee.put("Ann White", 85000);
		
		int max = 0;
        for (Integer entry : employee.values()) {
            if (entry > max) {
                max = entry;
            }
        }
    

        for (Map.Entry<String, Integer> entry : employee.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

	}}

