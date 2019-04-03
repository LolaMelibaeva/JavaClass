package com.class15;

import java.util.Scanner;

public class PracticeIQ7 {

	public static void main(String[] args) {
		
		//7. Write a java program to check whether a given number is prime or not?
		 
		Scanner in= new Scanner (System.in);
		System.out.println("Please enter a number");
		int num=in.nextInt();
		boolean prime=true;
		for (int i=2; i<num; i++) {
			if (num%i!=0) {
				
			}else {
				prime=false;
				break;
			}
		}System.out.println(prime);
	}
}
		
	
