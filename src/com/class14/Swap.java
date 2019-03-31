package com.class14;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int x = 10;
	        int y = 20;
	        System.out.println("Before swap:");
	        System.out.println("x value: "+x);
	        System.out.println("y value: "+y);
	        x +=y;//
	        System.out.println(x);
	        
	        y=x-y;
	        System.out.println(y);
	        
	        x=x-y;
	        System.out.println(x);
	        System.out.println("After swap:");
	        System.out.println("x value: "+x);
	        System.out.println("y value: "+y);
	        
	        
	        
	     int   a=10; int b=5;
	      System.out.println("Before swap:"+" a="+a+" b="+b);
	     a=a+b;
	     b=a-b;
	     a=a-b;
	        System.out.println("After swap: "+" a="+a+" b="+b);
	    }
	}


