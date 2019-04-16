package com.class05;

import java.util.Scanner;

public class InClassTasks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please, enter your quiz score");
		int quiz=sc.nextInt();
		
		System.out.println("Please, enter your midterm score");
		int midt=sc.nextInt();
		
		System.out.println("Please, enter your final score");
		int fnal=sc.nextInt();		
		
		int avg=(quiz + midt +fnal)/3;
		
		System.out.println("This is your Average Score for the semester " + avg);
		 
		if (avg>=90 && avg<100) {
			System.out.println("Your grade is A.");
		}else if(avg>=70 && avg<=90) {
			System.out.println("Your grade is B.");
		}else if(avg>=50 && avg<=70) {
			System.out.println("Your grade is C.");
		}else if (avg<50){
			System.out.println("Your grade is F.");
		}else {
			System.out.println("Invalid Grade");
		}

	}

}
