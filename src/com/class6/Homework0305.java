package com.class6;

import java.util.Scanner;

public class Homework0305 {

	public static void main(String[] args) {
		
		
		
		
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Please enter two strings");
		  String word1=sc.nextLine();		  		   
		  String word2=sc.nextLine();
		  System.out.println("Please enter two numbers");
		  int int1=sc.nextInt();
		  int int2=sc.nextInt();
		  
		   
		    if ((int1==int2) && (word1.equals(word2))) {
		    	System.out.println("AND");
		    }else if
	    	((int1==int2) || (word1.equals(word2))) {
		    	System.out.println("OR");
	    	
		    
		    }else if
	    	((int1!=int2) && (!word1.equals(word2))) {
		    	System.out.println("NONE");
		    }
		    	
		}
	}

	
	