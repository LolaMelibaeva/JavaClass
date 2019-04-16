package com.class08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		  int number;
	        
	        Scanner userInput = new Scanner(System.in);
	        
	        System.out.println("Enter a positive number: ");
	        number = userInput.nextInt();
	        
	        for(int i = 1; i <= 10; i++) {
	            System.out.println(number+" * "+i+" = "+number*i);
	        }
	    }

	}