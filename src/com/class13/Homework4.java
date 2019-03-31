package com.class13;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Write a program that reads two people’s first names and if they expecting boy or girl? 
 * Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL*/
		String babyname;
		Scanner input=new Scanner (System.in);
		System.out.println("What is mom's first name?");
		String momname=input.nextLine();
		System.out.println("What is dad's first name?");
		String dadname=input.nextLine();
		System.out.println("Boy or Girl?");
		String gender=input.next();
		if (gender.equalsIgnoreCase("boy")) {
			babyname=(dadname.toUpperCase().substring(0,dadname.length()/2).
					concat(momname.toUpperCase().substring(momname.length()/2)));
		}else if
			(gender.equalsIgnoreCase("girl")) {
			babyname=(momname.toUpperCase().substring(0,momname.length()/2).
					concat(dadname.toUpperCase().substring(momname.length()/2)));
		}else {
			babyname=("No suggestion");
		}System.out.println(babyname);
	}

}
