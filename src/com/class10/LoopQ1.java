package com.class10;

import java.util.Scanner;

public class LoopQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console= new Scanner(System.in);
	
		System.out.println("Please enter a positive integer");
		int num=console.nextInt();
	
		for (int i=1; i<=10; i++) {
			
		
		System.out.println(num+"*"+i+"="+num*i);
	}
		
		int fact=1;
		System.out.println("Enter positive number");
		int nom=console.nextInt();
		
		for (int j=1; j<=nom; j++) {
			fact*=j;
		}
		
		System.out.println("Factorial is: "+fact);
}
}