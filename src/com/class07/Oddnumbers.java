package com.class07;

public class Oddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;
		while (num <= 20) {
		//	System.out.println("I am inside while loop");
			if (num % 2 != 0) {
				System.out.print(num + " ");
			}
			num++;
		}

	}
}