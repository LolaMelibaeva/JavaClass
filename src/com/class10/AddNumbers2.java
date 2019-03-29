package com.class10;

import java.util.Scanner;

public class AddNumbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int  value;      // to hold data entered by the user
	      int  sum = 0;    // initialize the sum
	      char choice;     // to hold 'y' or 'n'

	      // Create a Scanner object for keyboard input.
	      Scanner console = new Scanner(System.in);

	      do
	      {
	         // Get the value from the user.
	         System.out.print("Enter integer: ");
	         value = console.nextInt();

	         // add value to sum
	         sum = sum + value;

	         // Get the choice from the user to add more number
	         System.out.print("Enter Y for yes or N for no: ");
	         choice = console.next().charAt(0);
	      }
	      while ((choice == 'y') || (choice == 'Y'));

	      //Display the total.      
	      System.out.println("Sum of the integers: " + sum);
	   }
	
	

}
