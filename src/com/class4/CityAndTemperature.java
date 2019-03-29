package com.class4;

import java.util.Scanner;

public class CityAndTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cityName;
			int temp;
			int celsius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter your city name?");
		cityName=sc.nextLine();
		
		System.out.println("Please, enter temperature in Fahrenheit");
		temp=sc.nextInt();
		celsius  = (temp-32)*5/9;
	        System.out.println("Temperature in Celsius in " + cityName + " is "+celsius); 
	        System.out.printf("The temperature in the city of %s, is %s fahrenheit or %s celcius.",cityName,temp,celsius);
	        sc.close();
	}

}
