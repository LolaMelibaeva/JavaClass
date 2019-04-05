package com.class17;

public class LargerNumber {

	public static void main(String[] args) {
		LargerNumber num=new LargerNumber();
		num.largerNumber(20, 10);
		
	}
	void largerNumber(int a, int b) {
		if (a > b) {
			System.out.println("a is larger than b");
		}else {
			System.out.println("b is larger than a");
		}
	}
}
