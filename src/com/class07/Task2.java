package com.class07;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Ask user to pay for a soda
 * keep asking user to pay for soda until entered price is not equal to 1.99
 * after user go a right amount print "please enjoy your soda"
 * 
 */
		Scanner scan=new Scanner(System.in);		
		
		double soda;
		do {
			System.out.println("Please enter the payment for soda");
				soda=scan.nextDouble();
				
		}while (soda!=1.99) ;
		System.out.println("Please, enjoy your soda.");
	}
	
}
