package com.class26;

public class ThisWithMethod {

	public void m1() {
		System.out.println("I am m1 method");
	}
	public void m2() {
		
		m1();
		System.out.println("I am m2 method");
	}
	
	public static void main(String[] args) {
		
		
		ThisWithMethod obj=new ThisWithMethod();
		obj.m2();
	}
}
