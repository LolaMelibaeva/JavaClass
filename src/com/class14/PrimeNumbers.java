package com.class14;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 64;
		boolean flag = true;
		
		for(int i = 2; i <= (int)(Math.sqrt(number)); i++) {
			
			if(number%i==0) {
				flag = false;
			}else {
				flag = true;
			}
		}
		if(flag) {
		System.out.println(number+" is a prime number.");
	} else {
		System.out.println(number+" is not a prime number.");
	   }
	}

}
