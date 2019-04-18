package com.class24;

public class TestStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticMethod obj=new StaticMethod();
		obj.test();
		System.out.println(obj.test("method"));
		System.out.println(obj.test(15, 20));

	}

}
