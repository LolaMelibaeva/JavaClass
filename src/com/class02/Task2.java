package com.class02;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int w = 5;
		int h = 8;
		
		int perimeter= 2*(w + h);
		int area = w*h;
		
		System.out.println("The perimeter of a rectangle with width " +  w + " and " +  "height " + h +
				" is equal to " + perimeter + " and area is " + area + ".");
		
		int num1 = 3;
	    int num2 = 7;
	    int num3 = 5;
	    int num4 = 1;
	    
	    //start coding here
	    int num=num1+num2;
	    int num5=num/num3;
	    int num6=num5-num4;
	    System.out.println("The result of arithmetic operations is equal to "+ num6);
	    
	    int myNumber=456;
	    int stepOne=myNumber*myNumber;
	    int stepTwo=stepOne+myNumber;
	    int stepThree=stepTwo/myNumber;
	    int stepFour=stepThree+17;
	    int stepFive=stepFour-myNumber;
	    int stepSix=stepFive/6;
	    System.out.println("The magic number is " + stepSix);
	}

}
