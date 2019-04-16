package com.class04;

import java.util.Scanner;

public class MortgageRatePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Create a Java program and store variables to store mortgage rate and mortgage price. First program should
		 *  check if rate is higher than 4.5 user will not buy a house, otherwise user will 
		 *  consider buying. Once user decides to buy a house, 		 
		 *  if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.*/
		 
		 double rate;
	
		 double price;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter mortgage rate");
			rate=sc.nextDouble();
			
			System.out.println("Enter your house price");
			price=sc.nextDouble();
			if (rate<4.5) {
				System.out.println("The client will buy a house");
				if (price<200000) {
					System.out.println("The client will pay cash");
				}else {
					System.out.println("The client will take a loan");
				}
			}else {
				System.out.println("The client won't buy a house ");
			}
	}
}