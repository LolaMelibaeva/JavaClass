package com.class10;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		
		 int num;      // to hold random number
	      int guess;    // to hold the number guessed by the user

	      // Create a Scanner object for keyboard input.
	      Scanner console = new Scanner(System.in);

	      // Get random number between 1 to 100.
	      num = (int) (Math.random() * 10) ;

	      do
	      {
	         System.out.print("Enter an integer between 1 to 10: ");
	         guess = console.nextInt();

	         if (guess == num)
	         {
	            System.out.println("You guessed the correct number.");
	         }
	         else if (guess < num)
	         {
	            System.out.println(
	                "Your guess is lower than the number.\nGuess again!");
	         }
	         else
	         {
	            System.out.println(
	                "Your guess is higher than the number.\nGuess again!");
	         }
	      }
	      while (guess != num);
	   }
	
	

}
