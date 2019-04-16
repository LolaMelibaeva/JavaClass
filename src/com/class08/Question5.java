package com.class08;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner console = new Scanner(System.in);
		     
	        int number;
	        int reverse = 0;
	        
	        System.out.print("Enter the number ");
	        number = console.nextInt();
	        
	        int temp = number;
	        int remainder = 0;
	        
	        while(temp>0)
	        {
		    remainder = temp % 10;
		    reverse = reverse * 10 + remainder;
	           temp/=
	        }

	        System.out.println("Reverse of " + number + " is " + reverse);
	    }
	}
	
