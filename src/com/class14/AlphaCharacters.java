package com.class14;

public class AlphaCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String day="It is a 1123wonderful $%?^day";
		String day1=day.replaceAll("[^a-zA-z]","");
		String day2=day1.replace("^","");
		System.out.println(day2.length());

	}

}
