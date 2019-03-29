package com.class4;

public class NestedIfAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double gpa=3.6;
		double expectedGpa=3.5;
		
		boolean hasDiploma=true;
		
		if (hasDiploma) {
			System.out.println("Congrats!");
			if(gpa>expectedGpa) {
				System.out.println("You are hired");
			}else {
				System.out.println("Unfortunately, we can not hire you");
			}
		}else {
			System.out.println("Please, get your degree");
		}
	}

}
