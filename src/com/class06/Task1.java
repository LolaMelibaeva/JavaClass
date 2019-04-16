package com.class06;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean snow, rain, sunny;
		String activity = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter the weather temperature in Farenheit");
		int temp = sc.nextInt();
		if (temp >= 40 && temp <= 80) {
			System.out.println("Is it raining");
			rain = sc.hasNextBoolean();{
			if (rain) {
				activity = "We will not go for hiking";
			} else {
				activity = "We will go for hiking";
			}
		} else if (temp >= 25 && temp <= 40) {
				System.out.println("Is it snowing?");
				snow = sc.hasNextBoolean();
				if (snow) {
					activity = "We will be going to snowboard";
				} else {
					activity = "We are not going to snowboard";
				}
		} else 	if (temp >= 80) {
					System.out.println("Is it sunny?");
					sunny = sc.hasNextBoolean();
					if (sunny) {
						activity = "We are going to the beach!";
					} else {
						activity = "We are not going to the beach:(";
					}
				} else {
					System.out.println("The activity is not known");
				}
		

		System.out.println(activity);
				
		}
		
	}	

