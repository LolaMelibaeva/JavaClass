package com.class10;

public class FindSumOfArray {

	public static void main(String[] args) {
		/** Write a program to sum the values of an array

		1, 2, 3, 4, 5, 6, 7, 8, 9, 10*/
		int sum=0;
		int [] array= {1,2,3,4,5,6,7,8,9,10};
		for (int i=0; i<array.length; i++) {
		sum+=array[i];
		
		
	}
		System.out.println(sum);
	}
}
