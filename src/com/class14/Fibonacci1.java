package com.class14;

public class Fibonacci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Fibonacci sequence

		int a = 0, b = 1, x, y = 10;
		
		System.out.print(a+" "+b);
		
		for(int i = 2; i < y; ++i) {
			
			x = a+b;
			System.out.print(" "+x);
			a = b;
			b = x;
		}
	}
}


