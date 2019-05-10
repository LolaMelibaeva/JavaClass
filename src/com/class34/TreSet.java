package com.class34;
import java.util.*;
public class TreSet {

	public static void main(String[] args) {
		/** Write a program to
        *
        * Print in ascending order print an element in a tree set which is greater than
        * the given element 25 in ascending order.
        *
        * Print all elements in descending orde*/
		
		
		Set num= new TreeSet();
		num.add(85);
		num.add(55);
		num.add(3);
		num.add(105);
		num.add(24);
		
		Iterator it=num.iterator();
		System.out.println("Printing elements which are greater than 25: ");
		while(it.hasNext()) {
			int num2=(int) it.next();
			if (num2>25) {
				
			System.out.println( num2);
		}
		
		}
		
		Set<Integer> intReverse = ((TreeSet) num).descendingSet(); 
		System.out.println("Before the reverse: "+num);
		System.out.println("After the reverse: "+intReverse);
		
		}

	}

		
	

