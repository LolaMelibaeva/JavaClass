package com.Class12;

public class StringWithArrayContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program to create a new String object with the contents of a character array
		
		char [] num= {'1', '2','3','4','5'};
		String string=String.copyValueOf(num, 1, 3);
		System.out.println("The book is " +string+ " pages.");
		System.out.println("------EndsWith--------");
		
		//Python Exercises" ends with "se"? false                                                                      
		//"Python Exercise" ends with "se"? true
		
		String str="Python Exercises";
		String str2="Python Exercise";
		boolean str1=str.endsWith("se");
		boolean str3=str2.endsWith("se");
		
		System.out.println(str1+" "+str3);
		
		System.out.println("------------Replace--------");
		
		String string1="The quick brown fox jumps over the lazy dog";
		String new_string=string1.replace('d','f');
		String new_string1=string1.replace("fox","cat");
		System.out.println(new_string);
		System.out.println(new_string1);
		
		System.out.println("---------------StartWith-----------");
		
		String strg="Red is my favorite color";
		String strg2="Orange is also my favorite color";
		boolean strg1=strg.startsWith("Red");
		boolean strg3=strg2.startsWith("Red");
		System.out.println(strg1+" "+strg3);
		
		System.out.println("------------Substring------------");
		
		String alphabet="The quick brown fox jumps over the lazy dog";
		String alpha=alphabet.substring(10, 25);
		System.out.println(alpha);
		
		System.out.println("----------Character Array Containing String----------");
		
		String langua="Java execise";
		char[] langua1=langua.toCharArray();
		System.out.println(langua1);
		
		System.out.println("----------Trim White Space-----------");
		String lingua="  Java Exercises  ";                                                                              
		String lingua1=lingua.trim();
		System.out.println(lingua1);
	}

}
