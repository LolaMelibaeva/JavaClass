package com.class8;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Two numbers are entered through the keyboard. Write a program to find the value of 
	 * one number raised to the power of another. (Do not use Java built-in method)
	 */
		   Scanner console = new Scanner(System.in);
		     
	        
	        int result = 1;
	        
	        System.out.print("Enter the base number ");
	        int base = console.nextInt();
	        
	        System.out.print("Enter the power ");
	        int power = console.nextInt();

	        for(int i = 1; i <= power; i++)
	        {
		    result *= base;
	        }

	        System.out.println("Result: "+ result);
	    }
	}
