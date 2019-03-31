package com.class14;

public class ClassTasks {

	public static void main(String[] args) {
		/*Create a String that will hold a sentence. Write a program to
		 *  get a new String without any spaces.
		 

		Create a String that should be combination of letters, numbers and special
 		characters. Find out how many alpha characters are there in the String.

		You have a String a=“Today is a good day! It is Thursday! We have a Java Class!“. 
		How would you find out how many sentences are in that String?*/

		
		String day="It is a beautiful day today.";
		String day1=day.replace(" ", "");
		System.out.println(day1);
		System.out.println("------Task2-----------");
		
		String str="I 787want %* 1 ice cream!!";
		String str1=str.replaceAll("[^A-Za-z]", "");
		String str2=str1.replaceAll(" ","");
		System.out.println(str2.length());
		
		System.out.println("------Task3---------");
		
		String java="Today is a good day! It is Thursday! We have a Java Class!";
		String[] java1=java.split("!");
		for (String today:java1) {
			
			System.out.println(today);
		}System.out.println("There are " + java1.length+" sentences.");
	}

}
