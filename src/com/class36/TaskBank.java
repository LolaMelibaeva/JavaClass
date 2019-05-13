package com.class36;

public class TaskBank {

	public static void main(String[] args) {
		withdrawMoney(1200.0, 1400.00);
		
		
	}
	
	
	public static void withdrawMoney (double balance, double withdraw) {
		
		if (withdraw<balance) {
			System.out.println("Your transcaction is approved. Please, take your money");
		}else {
			throw new ArithmeticException ("Your transaction is denied. Please, increase"
					+ " your balance to be able withdraw money.");
		}
	}

}
