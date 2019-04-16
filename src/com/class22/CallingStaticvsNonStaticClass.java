package com.class22;

public class CallingStaticvsNonStaticClass {

	public static void main(String[] args) {
		StaticvsNonStatic obj=new StaticvsNonStatic ();
		System.out.println(obj.name);
		System.out.println(StaticvsNonStatic.lastName);
		StaticvsNonStatic.getInfo1();
		obj.getInfo();
		
	}
}
