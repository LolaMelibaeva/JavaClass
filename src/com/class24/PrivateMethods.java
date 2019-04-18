package com.class24;

public class PrivateMethods {

	
	private void test() {
		System.out.println("I am a private no value return type method");
	}
	
	private void test (String str) {
		 System.out.println("I am a private return type "+str);
		
	}
	
	private int test (int a, int b) {
		int sum=a+b;
		return sum;
	}
	
	
	public static void main(String[] args) {
		PrivateMethods obj=new PrivateMethods();
		
		obj.test();
		obj.test("method");
		System.out.println(obj.test(89,11));
	}
}
