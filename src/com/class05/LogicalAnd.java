package com.class05;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Ask user to enter age and based on the age we will print:
 * if age is older than 1 but less than 3-->baby
 * if age is older than 3 but less than 5-->toddler
 * if age is older than 5 but less than 12--> kid
 * if age is older than 13 but less than 20-->teenager
 * if age is older than 20 but less than 64-->adult
 * if age is older or equal to 64--> senior;
 * 
 */
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age and based on the age we will print");
		int age=sc.nextInt();
		if (age>=1 && age<=3 ) {
			System.out.println("You are a baby");
		}else if (age>=3 && age<=5) {
			System.out.println("You are a toddler");
		}else if (age>=5 && age<=12) {
			System.out.println("You are a kid");
		}else if (age>=13 && age<=20) {
			System.out.println("You are a teenager");
		}else if (age>=20 && age<=64) {
			System.out.println("You are an adult");
		}else {
			System.out.println("You are a senior");
		}
	}

}
