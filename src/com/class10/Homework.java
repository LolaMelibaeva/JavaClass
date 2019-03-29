package com.class10;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan=new Scanner(System.in);
		    /*Note: Create a main Method, and also use a Scanner Class
Write a program that creates an array of strings with the size being 7. 
Ask the user to input Days of a week beginning with Sunday.
 Add these inputs to your array and print the values using a for-each loop.

Hint: */	
		
		
		String []weekdays=new String [7];
		
		
		 Scanner input = new Scanner(System.in);
		 for (int i=0; i<weekdays.length; i++) {
		System.out.println("Please enter day " +(i+1)+ " of the week");
		 weekdays[i]=scan.nextLine();
		 }
		 for (int k=0; k<weekdays.length; k++) {
		 
		 System.out.println(weekdays[k]);
		 
}		 
} 
}	
