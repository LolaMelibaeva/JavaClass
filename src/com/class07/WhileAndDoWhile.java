package com.class07;

public class WhileAndDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		do {//executes first and then checks condition
			System.out.println("Hello");
			a++;
		}while (a>15);
		
		int b=10;
		while (b<15) {//checks condition and then execute
			System.out.println("Bye");
			b++;
		}
	}

}
