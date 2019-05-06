package com.class34;
import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		
		
		Map<String, Integer> salaryMap=new HashMap<>();
		salaryMap.put("John", 70000);
		salaryMap.put("Jon", 80000);
		salaryMap.put("Jack", 90000);
		salaryMap.put("Jan", 75000);
		salaryMap.put("Jeen", 85000);
		
		//int maxSalary=Integer.MIN_VALUE;
				int maxSalary=0;
				String key=null;
		for(Map.Entry<String, Integer> entry:salaryMap.entrySet()) {
			if (entry.getValue()>maxSalary) {
				maxSalary=entry.getValue();
				key=entry.getKey();
			}
		}
		
		System.out.println(maxSalary+" belongs to "+key);
	}

}
