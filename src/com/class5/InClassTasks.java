package com.class5;

import java.util.Scanner;

public class InClassTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your height number in inches");
		int h=sc.nextInt();
		
		if (h>=0 &&	h<=60) {
			System.out.println("You are a short height");
			
		}else if(h>=60 && h<=72) {
			System.out.println("You are a medium height");
			
		}else {
			System.out.println("You are a tall height");
		}
	}

}
