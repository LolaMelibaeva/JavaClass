package com.class24;

public class StaticMethod {
	
	
	static void test () {
		System.out.println("I am static void method with no parameters");
	}
	
	static String test (String str) {
		String s="I am a static return type "+str;
		return s;
	}
	
	static int test (int a, int b) {
		int sum=a+b;
		return sum;
	}

}
