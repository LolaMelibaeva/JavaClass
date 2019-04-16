package com.class05;

import java.util.Scanner;

public class ConditionsAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Ask user to enter price and boolean value for sale
 * Based on the sale we will check price;
 * if price<20--> aply discoutn 20% and give final price
 * if price is >20 less 100--> aplly discount 30% and give final price
 * if price is >100 less 500 --> apply discount 50% and give final price
 */
		boolean sale;
		int discount, price; double finalPrice;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter if there is a sale.");
		sale=sc.nextBoolean();
		
		System.out.println("Please, enter price of your purchase.");
		price=sc.nextInt();
		
		if(sale) {
			System.out.println("Let's check all discounts");
			if (price<20) {
				discount=20;
				finalPrice=price - (price*.2);				
			}else if (price>=20 && price<100){
				discount=30;
				finalPrice=price - (price*.3);				
		    } else if (price>=100 && price<500) {
				discount=50;
				finalPrice=price - (price*.5);				
			}else {
				discount=75;
				finalPrice=price - (price*.75);		}	
			System.out.println("Your discount is " + discount);
			System.out.println("Your final price is " + finalPrice);
							
		}else {
			System.out.println("Not interested.");
		}
		
		
		
	}

}
