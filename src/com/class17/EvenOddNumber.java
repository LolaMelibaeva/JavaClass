package com.class17;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Enter an integer: ");
	        num = console.nextInt();
	                
	        if(isEven(num))
	        {
	            System.out.println("Number is even");
	        }
	        else
	        {
	            System.out.println("Number is odd");
	        }    
	    }

	
	public static boolean isEven (int a) {
		if (a%2==0) {
			return true;
		}else {
			return false;
		}
		
	}

}
