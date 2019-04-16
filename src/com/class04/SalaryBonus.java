package com.class04;

import java.util.Scanner;

public class SalaryBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int years;
		int salary;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please, enter number year you have worked");
		years=sc.nextInt();
		
		System.out.println("Please, enter your salary amount");
		salary=sc.nextInt();
		
		if (years>=5) {
			System.out.println("You are eligible for the bonus.");
			if (salary>=50000) {
				System.out.println("You are eligible for $5000 bonus.");
			}else {
				System.out.println("You are eligible for $3000 bonus.");
			}
		}else {
			System.out.println("You are not eligible for bonus.");
		}
	}

}
