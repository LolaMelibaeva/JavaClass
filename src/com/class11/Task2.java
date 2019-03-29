package com.class11;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] countries = { "USA", "Mexico", "Brazil", "Spain", "France", "Italy" };
		for (int i = 0; i < countries.length; i++) {
			if (countries[i].equals("USA")) {
				System.out.println("Washington DC");
			} else if (countries[i].equals("Mexico")) {
				System.out.println("Mexico city");
			} else if (countries[i].equals("Brazil")) {
				System.out.println("Rio de Janeiro");
			} else if (countries[i].equals("Spain")) {
				System.out.println("Madrid");
			} else if (countries[i].equals("France")) {
				System.out.println("Paris");
			} else if (countries[i].equals("Italy")) {
				System.out.println("Rome");
			}
			
	}
		System.out.println();
		
		String [] array= {"USA", "Germany", "Portugal", "UK"};
		for (String country : array) {
			switch (country) {
			
			case "USA":
				System.out.println("Washington DC");
				break;
			case "Germany":
				System.out.println("Berlin");
				break;
			case "Portugal":
				System.out.println("Lisbon");
				break;
			case "UK":
				System.out.println("London");
				break;
			
			}
				
		}
		
		
		
		
}
}
