package com.class6;

import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String favoriteFood;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your country you are from");
		String country=sc.nextLine();
		
		switch (country) {
		
		case "USA":
			favoriteFood="Burger";
			break;
		case "Afganistan":
			favoriteFood="Palau";
			break;
		case "Russia":
			favoriteFood="Pelemeni";
			break;
		case "Italy":
			favoriteFood="Pasta";
			break;
		case "Turkey":
			favoriteFood="Pahlava";
			break;
		case "Morocco":
			favoriteFood="Couscous";
			break;
		case "Kazakhstan":
			favoriteFood="Beshparmak";
			break;
		case "Pakistan":
			favoriteFood="Biryani";
			break;
		default:
			favoriteFood="Unknown";
		}
		System.out.println("Your favorite food is " + favoriteFood);
	}

}
