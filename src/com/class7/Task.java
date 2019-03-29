package com.class7;

public class Task {
	/*
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean workDay = true;
		int day=1;
		while (workDay) {
			System.out.println("I need a day off");
						if (day==5) {
				System.out.println("I don't need a day off");
					workDay=false;
			}			
			day++;
		}
			
	}

}


