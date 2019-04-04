package com.class16;

import java.util.Scanner;

public class ReviewClassTask {
	
	public static void main(String[] args) {
		ReviewClassTask task=new ReviewClassTask();
		
		task.print();
		task.scannerFirstName();
		task.scannerInt();
	}		
		void print () {
			System.out.println("I do not have a return type");
		}
		void scannerFirstName() {
			Scanner scan=new Scanner(System.in);
			scan.nextLine();
		}
		void scannerInt() {
			Scanner scan=new Scanner(System.in);
			scan.nextInt();
		}
	}

