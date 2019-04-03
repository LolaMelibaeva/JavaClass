package com.class15;

public class PracticeIQ4 {

	public static void main(String[] args) {
		//4.How to find out the part of the string from a string? 
		//What is substring? Find number of words in string?

		String a="Welcome";
		String a1=a.substring(3,7);
		System.out.println(a1);
		//Substring is a continuous sequence of characters derived from a string.
		
		int a2=a.length();
		System.out.println("The length of the string " +a + " is "+a2);
	}

}
