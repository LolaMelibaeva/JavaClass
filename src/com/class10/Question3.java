package com.class10;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program that creates an array of 10 elements size.
		//Your program should prompt the user to input numbers in array and then display the sum
		//of all array elements.
		
		int size=10;
		
		Scanner console=new Scanner(System.in);
		int []array=new int[size];


		 
		for (int k=0; k<size; k++) {
			System.out.println("Please, input "+size+ " numbers");
			array[k]=console.nextInt();
			
		}
		int sum=0;
		
		for (int k=0; k<size; k++) {
			sum+=k;
		}
		System.out.println("The sum of 10 elements is: " + sum);
	}
	}


