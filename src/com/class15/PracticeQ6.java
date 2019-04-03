package com.class15;

public class PracticeQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//6. Write a Java Program to find whether a String is Palindrome or not?
		
		
		String a="apple";
		String reverse="";
		for (int i=a.length()-1; i>=0; i--) {
			reverse+=a.charAt(i);}
			if (a.equalsIgnoreCase(reverse)) {
				System.out.println(a+ " is a Palindrome word");
			}else {
				System.out.println(a +" is not a Palindrome word");
			}
		}
	}


