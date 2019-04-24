package com.class26;

public class Bank {
	
	int getBalance () {
		return 0;
	}
}

class BankA extends Bank {
	
	int getBalance () {
		
		return 1000;
	}
}

class BankB extends Bank {
	
	int getBalance () {
		
		return 1500;
	}
}
class BankC extends Bank {
	
	int getBalance () {
		
		return 2000;
	}
}
class TestBank {
	
	public static void main(String[] args) {
		
		Bank b=new BankA();
		System.out.println("BankA deposit is "+b.getBalance());
		
		Bank b1=new BankB();
		System.out.println("BankB deposit is "+b1.getBalance());
		
		Bank b2=new BankC();
		System.out.println("BankC deposit is "+b2.getBalance());
	}
}

