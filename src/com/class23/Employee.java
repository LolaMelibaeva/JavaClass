package com.class23;

public class Employee {
	
	protected int salary1=90000;//protected
	int salary;//default
	public static String department="IT";

	public void getPaid() {
		System.out.println("Employee gets paid "+ salary);
	}
	public static void work() {
		System.out.println("Employee works in "+department+" department");
	}
	
	protected void test() {
		System.out.println("I am a protected method");
	}
	void test1() {
		System.out.println("I am a default method");
	}

}
