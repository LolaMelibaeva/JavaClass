package com.class10;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   {
		      final int SIZE = 5;    // size of array

		      // Create an array to hold employee salary.
		      double[] salaries = new double[SIZE];

		      // Create a Scanner object for keyboard input.
		      Scanner console = new Scanner(System.in);

		      System.out.println("Enter the salaries of " + SIZE
		                         + " employees.");

		      // Get employees' salary.
		      for (int i = 0; i < SIZE; i++)
		      {
		         salaries[i] = console.nextDouble();
		      }

		      // Display the values stored in the array.
		      System.out.println("The salaries are:");

		      for (int i = 0; i < SIZE; i++)
		      {
		         System.out.println(salaries[i]);
		      }
		   }
		}
	}


