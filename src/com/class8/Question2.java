package com.class8;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 
	Scanner scan=new Scanner(System.in);
	System.out.println("Please input a positive integer");
	int Input=scan.nextInt();
	
	for (int i=0; i<=10; i++) {
		System.out.println(Input+"*"+i+"="+Input*i);
	}
	}

}
