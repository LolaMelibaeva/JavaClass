package com.class05;

import java.util.Scanner;

public class Homework{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*1. Write a program to find largest of three double values using if-else .. 
 * if provided by a user(numbers must be distinct)
  */
			
		 	Scanner sc=new Scanner(System.in);
		 	System.out.println("Please, enter three double values.");
			 double n1=sc.nextDouble();
			 double n2=sc.nextDouble();
			 double n3=sc.nextDouble();
		    if( n1>=n2 && n1>=n3)
		        System.out.println("The largest double value is " + n1);

		    else if (n2>=n1 && n2>=n3)
		        System.out.println("The largest double value is " + n2);

		    else
		        System.out.println("The largest double value is " + n3);

		    	
	}    
		    
	}


