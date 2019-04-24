package com.class26;

public class IfNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int age=15;
		int weight=50;
		
		if (age>=25) {
			if (weight>=50) {
				System.out.println("You are elgibile to donate blood");
				
							
			}else {
				System.out.println("You are not eligible to donate blood");
			}
	
			
		} else {
			System.out.println("Your age should be over 25");
		}
	}

}
