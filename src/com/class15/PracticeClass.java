package com.class15;

public class PracticeClass {

	public static void main(String[] args) {
	
//		1. Write a program to swap 2 numbers without a temporary variable? 
				//Swap  2 strings without a temporary variable?
		
		int a=45;
		int b=25;
		
		System.out.println("Variables before swap: a="+a+" b="+b);
		
		a=a+b;//70
		b=a-b;//45
		a=a-b;//25
		
		System.out.println("Variables after swap: a="+a+" b="+b);
		
		String str="Hello";
		String str1="Hi";
		System.out.println("String before swap: str= "+str+" str1="+str1);
		str=str+str1;//HelloHi;
	//	System.out.println(str);
		str1=str.substring(0,str.length()-str1.length());//Hello
		System.out.println(str1);
		System.out.println(str);
		str=str.substring(5);//HelloHi-Hello
		System.out.println("String after swap: str= "+ str+ " str1="+str1);
		
		
	
	
		
	}

}
