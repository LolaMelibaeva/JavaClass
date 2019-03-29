package com.class9;

import java.util.Scanner;

public class Set_Intigers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Write a program that reads a set of integers, provided by a user and 
 * 
 * then prints the sum of the even and odd integers.
 */	
		int evenSum=0;
		int oddSum=0;
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a start and end point of range of numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		for (int i=num1; i<=num2; i++) {
			if( i % 2 == 0)
            {
                evenSum += i;
            }
            else
            {
                oddSum += i;
            }
		}
		System.out.println("Sum of Even numbers: " + evenSum);
		System.out.println("Sum of Odd numbers: " + oddSum);
	}

}
