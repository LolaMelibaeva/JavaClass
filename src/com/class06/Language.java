package com.class06;

import java.util.Scanner;

public class Language {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Lang;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which country you are from");
		String country = sc.nextLine();
		switch (country) {
		case "USA":
			Lang = "English";
			break;
		case "Kazakhstan":
			Lang = "Kazakh";
			break;
		case "Russia":
			Lang = "Russian";
			break;
		case "Italy":
			Lang = "Italian";
			break;
		case "France":
			Lang = "French";
			break;
		case "Egypt":
			Lang = "Arabic";
			break;
		case "Germany":
			Lang = "German";
			break;
		case "Spain":
			Lang = "Spanish";
			break;
		default:
			Lang = "Unknown";
		}
		System.out.println("The language you speak is " + Lang);
	}

}
