package com.class17_2;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*5.
Write a guessing game where the user has to guess a secret number between 1 and 20.
 After every guess input, the program tells the user whether their number was too large or too small. 
 The program will keep asking the user to enter the number until he finds the correct number. 
 When the correct answer is found the system should display "Congratulations!!. You got it!".*/
		int secret=8;
		int num=0;
		Scanner scan=new Scanner (System.in);
		
		
		
		do {
			System.out.println("Please, enter a secret number between 1 and 20");
			 num=scan.nextInt();
			 if (num<secret) {
				 System.out.println("Your number is too small");
			 }else if (num>secret) {
				 System.out.println("Your number is too large");
			 }
		
		}while (num!=secret);
			System.out.println("Congratulations! You got it");
		
					
		
		
		}
	
}

