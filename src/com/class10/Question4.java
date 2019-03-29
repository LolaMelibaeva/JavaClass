package com.class10;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		//The variable list1 and list2 are reference arrays that each have 5 elements.
		//Write code that copies the values in list1 to list2. Values in list1 are input by user.

		final int SIZE = 5;

	      int[] list1 = new int[SIZE];
	      int[] list2 = new int[SIZE];

	      Scanner console = new Scanner(System.in);
	      System.out.println("Enter " + SIZE + " numbers.");

	      // Get value in list1
	      for (int i = 0; i < SIZE; i++)
	      {
	          list1[i] = console.nextInt();
	      }

	      // Copy elements in list2.
	      for (int i = 0; i < SIZE; i++)
	      {
	          list2[i] = list1[i];
	      }
	      
	      // Display elements of list2.
	      System.out.println("Elements of list2 are: ");
	      for (int i = 0; i < SIZE; i++)
	      {
	          System.out.println(list2[i]);
	      }
	   }
	}