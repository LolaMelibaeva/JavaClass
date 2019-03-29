package com.class2;

public class VariableChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Values of avariable can be changed	
		String name = "John";
		String lastName = "Smith";
		System.out.println(lastName);
		lastName="Johnson";
		char grade = 'B'; //char grade='A'; do not work
		 grade = 'A';
		 
		 String city = "Fairfax";
		 
		 city="New York";
		 
		 System.out.println(grade);
		 System.out.println(city);
		System.out.println(lastName);
		
	}

}
