package com.class24;

public class Bank {
		
	public int chargeInterest() {
		return 0;
	}//parent class
}

class BOA extends Bank{
	@Override//annotation
	public int chargeInterest () {
		return 2;
	}//1 child class
}

class PNC extends Bank{
	@Override //annotation
	public int chargeInterest () {
		return 3;
	}//2 child class
}
