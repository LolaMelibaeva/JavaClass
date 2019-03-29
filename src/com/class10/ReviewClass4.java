package com.class10;

public class ReviewClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
				/*  * Write a program that prints the following pattern
			        
			....1
			...2
			..3
			.4
			5
			*/
		for(int i =1; i<=5; i++) {
		    for(int k = 1; k<=(5-i); k++) {
		        System.out.print(".");
		    }
		   
		    for(int l = 1; l<=1; l++) {
		        
		        System.out.print(i);
		    }
		    System.out.println();
		    
		}
	}

}
