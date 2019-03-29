package com.class4;


import java.util.Scanner;

public class ScannerClass
{

	public static void main(String[] args) {
		// take a number from user and print that number
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number");
		int myNumber=sc.nextInt();
		
		System.out.println("The number you entered is " +  myNumber);
	}

}
