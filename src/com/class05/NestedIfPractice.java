package com.class05;

public class NestedIfPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*check if user has a credit card
		 * check what is the balance if balance is more than 1000 --> then pay off immediately;
		 * else you are good.
		 */
		
		boolean creditCard=true;
		int balance=100;
		if (creditCard) {
			System.out.println("Let's check the balance");
			if(balance>=1000) {
				System.out.println("Pay off now");
			}else {
				System.out.println("you are good");
			}
			
			
			
			
			}else {
				System.out.println("Do you want a credit card");
			}
	}

}
