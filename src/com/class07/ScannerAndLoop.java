package com.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Prompt user to ask the name 3 times and print "you are doing great____"//
		String name = null;
		Scanner scan=new Scanner(System.in);
		int a=0;
		while (a<3) {
			System.out.println("please enter your name");
			name=scan.nextLine();
			System.out.println("You are doing great " + name);
			a++;
		}
		
	}

}
