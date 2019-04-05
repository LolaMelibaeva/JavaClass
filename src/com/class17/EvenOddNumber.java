package com.class17;

public class EvenOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EvenOddNumber num=new EvenOddNumber();
		num.evenOdd(5);
	}
	
	void evenOdd (int a) {
		if (a%2==0) {
			System.out.println(a+ " is even number");
		}else {
			System.out.println(a+ " is odd number");
		}
		
	}

}
