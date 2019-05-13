package com.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter integer value");
		
		try {
			int num=sc.nextInt();
			System.out.println("Your number is : "+num);
		}catch (InputMismatchException e) {
			System.out.println("Please, enter only integer value");
		}
	}

}
