package com.class17;

import java.util.Scanner;

public class Question1 {
/*Write a program with a method named getTotal that accepts two integers as an argument and return its 
 * sum. Call this method from main( ) and print the results.
 */
	public static void main(String[] args) {
		Question1 numb=new Question1();
		
		numb.getTotal(5, 15);
		

	}
	
	void getTotal (int a, int b) {
		
	int total=a+b;
		System.out.println("Total is:"+total);
	}

}
