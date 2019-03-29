package com.class13;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter any programming language");
		   String language = sc.nextLine();     
		   String print = null;
		
		
		if (language.equals("Java")) {
	           print="Java is a programming language.";
	       }
	       else if (language.equals("C")) {
	           print="C is a procedural programming language";
	       }
	       else if (language.equals("C+")) {
	           print="C+ is a middle-level programming language";
	       }else if (language.equals("C++")) {
	           print="C++ is a middle-level programming language";
	       }
	    else {
	        print="Doesn't match any programming language";
	    }

	   System.out.println(print);
	}

}
