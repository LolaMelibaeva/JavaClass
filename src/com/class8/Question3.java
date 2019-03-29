package com.class8;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to find the factorial value of any number entered through the keyboard.
		int fact=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please a value of any number to find factorial");
		int num=scan.nextInt();
		
		for (int i=1; i<=num; i++) {
			fact *= i;
		}
		System.out.println(num+"!"+"="+fact);
	}

}
