package com.class4;

import java.util.Scanner;

public class DriverLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("What is your age?");
		age=sc.nextInt();
		
		if (age>=18) {
			System.out.println("I will issue a Driver License.");
			
		}else if (age>=15.9) {
			System.out.println("You can only apply for a Learner's Permit.");
			
		
		}else {
			System.out.println("You are not allowed to apply neither a DL or a LP");
		}
		
	}

}
