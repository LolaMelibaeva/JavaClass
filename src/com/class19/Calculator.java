package com.class19;

import java.util.Scanner;

public class Calculator {

	
	static int sum (int a, int b, int c) {
		
		
		return (a+b+c);
		
	}
	static int ave (int a, int b, int c) {
		
		 
		return (a+b+c)/3;
}
	
	static int min (int a, int b, int c) {
	 int min=a;
	 if (b<a) {
		 min=b;
	 }else if (c<min) {
		 min=c;
	 
	}return min;
	}

static int max (int a, int b, int c) {
	 int max=a;
     
     if(b>a) {
         max = b;
     }
     if(c>max) {
         max = c;
     }
         
     return max;
     
 }
 
	}

