package com.class10;

import java.util.Scanner;

public class FindSpecificValue {


       /* * Write a program to test if an array contains a specific value.
        *
        * Hint: use a boolean flag
        */
	public static void main(String[] args) {
		
		int[] value = { 1, 12, 3, 60, 5, 6, 20, 8, 35, 10 };
	
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		int Num = input.nextInt();

		
		

		for (int i = 0; i < value.length; i++) {
		if (value[i] == Num) {
		System.out.print("\nYes, "+Num+" is in this array.");
		break;
		
		}else {
		System.out.print("\nNo, "+Num+" is not in this array.");
		break;
		}
		}
		}

}
