package com.class6;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		String expl;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your grade");
		grade =sc.next().charAt(0);
		switch (grade) {
		case 'A':
			expl = "Excellent";
			break;
		case 'B':
			expl = "Good";
			break;
		case 'C':
			expl  = "Average";
			break;
		case 'D':
			expl = "Bad";
			break;
		default:
			expl  = "Not Acceptable";
		}
		System.out.println(grade + " is " + expl);
	}

}
	


