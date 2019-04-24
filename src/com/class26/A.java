package com.class26;

public class A {
	

	final void isDisplayed () {
		System.out.println("I am a final method in parent class A");
	}
	
	final void isDisplayed (String str) {
		System.out.println("I am an overloaded method in parent class "+str);
	}
}

class B extends A{
	
//	final void isDisplayed() {
	//	System.out.println("I am overriding final method in child class B");
	//}
}

class TestAB{
	
	public static void main(String[] args) {
		
		
		A obj=new A();
		obj.isDisplayed("A");
		obj.isDisplayed();
	}
	
}