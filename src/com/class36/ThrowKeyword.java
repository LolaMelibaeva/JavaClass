package com.class36;

public class ThrowKeyword {

	public static void main(String[] args) {
		
//		checkAgeEligibility (19);
//		checkAgeEligibility (17);
//		twoNumDiv(10, 0);
		checkUserNameLength("Jonas");
		
	}
		
		public static void checkAgeEligibility (int age) {
			
			if (age>=18) {
				System.out.println("Congrats on your DL");
			}else {
				throw new ArithmeticException("You are not eligible for a DL");
			}
		}
		
		public static void twoNumDiv (int a, int b) {
			
			if(b!=0) {
				System.out.println(a/b);
			}else {
				throw new ArithmeticException ("We can not divide by zero");
			}
		}
		public static void checkUserNameLength(String userName) {
			if (userName.length()>3) {
				System.out.println("Username is accepted");
			}else {
				throw new NullPointerException ("Username must be long than 3 characters");
				
			}
		}
		
	}

		

