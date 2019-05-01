package com.class27;

public class Hello {
	
	Hello(String str){
		System.out.println("I am a constructor with 1 parameter");
	}
	
	Hello(String str1, int a){
		this("Hi");
		System.out.println("I am a constructor with 2 parameters");
	}
	Hello(String str2, double b, boolean isTrue){
		this("Hello", 5);
		System.out.println("I am a contructor with 3 parameters");
	}
}
class TestHello{
	public static void main(String[] args) {
		Hello obj=new Hello("Bye", 2.3, true);
	}
}