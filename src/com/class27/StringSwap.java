package com.class27;

public class StringSwap {
	
	public static void main(String[] args) {
		
		
		String a="Hello";
		String b="Bye";
		
		a=a+b;
		System.out.println(a);
		b=a.substring(0, 5);
		System.out.println(a.length());
		System.out.println(b.length());
		System.out.println(a.length()-b.length());
		System.out.println(b);
		a=a.substring(b.length());

		System.out.println(a);
	}

}
