package com.class14;

public class SwapStrings {

	public static void main(String[] args) {
		//Swap two Strings

				String a = "Hello";
				String b = "Dear";
				
				System.out.println("Before swap: "+a+" "+b);
				
				a = a+b;
				b = a.substring(0, a.length()-b.length());//a9-b4
			//	System.out.println(b.length());
			//	System.out.println(a.length());
			//	System.out.println(b);
				a = a.substring(b.length());
				//System.out.println(a);
			
				
				System.out.println("After swap: "+a+" "+b);
				System.out.println(a);
				System.out.println(b);
				
				System.out.println("---------------------------");
				
				String c="Apple";
				String d="Pear";
				System.out.println("Before swap"+" "+c+ " "+d);
				c=c+d;
				d=c.substring(0,c.length()-d.length());
				c=c.substring(d.length());
				System.out.println("After swap "+" "+ c+" "+d);

	}

}
