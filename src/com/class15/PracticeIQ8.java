package com.class15;

public class PracticeIQ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //8. Write a Java Program to print first 10 numbers of Fibonacci series.
		
		int a=0;
		int b=1;
		int c=0;
		
		for (int i=0; i<10; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+ " ");
		}
	}	

}
