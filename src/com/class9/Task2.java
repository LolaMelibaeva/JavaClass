package com.class9;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Ask user to enter the item they want to buy and  the price for the item. 
 * Then ask user to pay for it. Every time user enters money accumulate the amount and tell 
 * user how much is left to pay off the amount. Whenever user done with payments tell them 
 * "Thank you for shopping!"
 * 
 * 
 */
		double sum=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the item you want to buy");
		String item=scan.nextLine();
		System.out.println("Enter the price for the item");
		double price=scan.nextDouble();
		
		do {
		System.out.println("Now please pay for your item");
		double price1=scan.nextDouble();
			sum=sum+price1;
			if (sum!=price) 
			System.out.println("Please enter more $"+(price-sum));
			}
		
		while (sum!=price);
		System.out.println("Thank you for shopping with us");
	
		
			
		}	
		}
				
	


