package com.class10;

public class EvenArray {

	public static void main(String[] args) {
		int[] numbers = { 2, 5, 16, 18, 21 };

	      // Display all even elements of array
	      System.out.println("The even numbers of array:");

	      for (int i = 0; i < numbers.length; i++)
	      {
	         if (numbers[i] % 2 == 0)
	         {
	            System.out.print(numbers[i] + " ");
	         }
	      }

	     System.out.println();
	     System.out.println("The odd numbers of array:");

	     for (int i = 0; i < numbers.length; i++)
	      {
	         if (numbers[i] % 2 != 0)
	         {
	            System.out.print(numbers[i] + " ");
	   }
	}
	}
}