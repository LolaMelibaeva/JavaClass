package com.class28;

public interface Bank {
	
	static String name="Bank"; //by default all variable public static final
	//by default compiler adds public and abstract to every method
	void hasChecking ();
	void hasSavings();
	void hasCreditCard();
	//static void hasLoan(); can NOT have static method in the interface
}
class BOA implements Bank{

	@Override
	public void hasChecking() {
		// TODO Auto-generated method stub
		System.out.println("BOA has 2 checking accounts");
	}

	@Override
	public void hasSavings() {
		// TODO Auto-generated method stub
		System.out.println("BOA has 2 savings accounts");
	}

	@Override
	public void hasCreditCard() {
		// TODO Auto-generated method stub
		System.out.println("BOA has 10 different CCs");
	}
	
}
class PNC implements Bank{

	@Override
	public void hasChecking() {
		// TODO Auto-generated method stub
		System.out.println("PNC has 3 checking accounts");
	}

	@Override
	public void hasSavings() {
		// TODO Auto-generated method stub
		System.out.println("PNC has 3 savings accounts");
	}

	@Override
	public void hasCreditCard() {
		// TODO Auto-generated method stub
		System.out.println("PNC has 7 different CCs");
	}
	
}
class BankTest{
	public static void main(String[] args) {
		
		
		Bank obj=new BOA();
		obj.hasChecking();
		obj.hasSavings();
		obj.hasCreditCard();
		System.out.println();
		Bank obj1=new PNC();
		obj1.hasChecking();
		obj1.hasSavings();
		obj1.hasCreditCard();
	}
}