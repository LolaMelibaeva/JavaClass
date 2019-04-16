package com.class04;

import java.util.Scanner;

public class Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double loan= 200000.00;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("What is the amount of loan is needed?");
		loan=sc.nextDouble();
		
		if (loan<=20000.00) {
			System.out.println("I will lend the money to you.");
		}else {
			System.out.println("Sorry, I have to reject your request.");
		}
		
	}

}
