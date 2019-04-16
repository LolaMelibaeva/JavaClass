package com.class08;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
	     
        int number;
        
        int evenSum = 0;
        int oddSum = 0;
        
        System.out.print("Enter the number ");
            number = console.nextInt();
        
            if( number % 2 == 0)
            {
                evenSum += number;
            }
            else
            {
                oddSum += number;
            }
            
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        
	}
}
