package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4EvenNumbers {

	public static void main(String[] args) {

		ArrayList<Integer> numbers=new ArrayList<Integer>();
		for (int i=2; i<=50; i+=2) {
			if(i%2==0) {
			numbers.add(i);
			}	
			}
		
			System.out.println(numbers);
			
			Iterator<Integer>it=numbers.iterator();
			while(it.hasNext()) {
				int num=it.next();
				if(num%5==0) {
					it.remove();
		}
		}
System.out.println(numbers);
	}
}


