package com.class10;

import java.util.Scanner;

public class DayWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] days = new String[7];
		   Scanner obj = new Scanner(System.in);

		   for(int i=0; i<days.length; i++){
		     System.out.println("Please enter day "+(i+1)+" of the week");
		     days[i] = obj.nextLine();
		   }

		   for(int j=0; j<days.length; j++){
		     System.out.println(days[j]);
		   }
		 }
}