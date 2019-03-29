package com.class4;

import java.util.Scanner;

public class ScannerClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String a, b, c;
			Scanner input= new Scanner(System.in);
			System.out.println("Please enter your name");
			a=input.nextLine();
			
			System.out.println("Good morning " + a);
			
			System.out.println("How are you feeling today, " + a + "?");
			b=input.nextLine();
			
			System.out.println("What are you doing " + a + "?");
			c=input.nextLine();
	}

}
