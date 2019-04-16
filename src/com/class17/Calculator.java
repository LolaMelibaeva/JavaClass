package com.class17;

import java.util.Scanner;

import com.class18.Application;

public class Calculator extends Application {

	public static void main(String[] args) {
		Calculator cal=new Calculator ();
		Scanner calc=new Scanner (System.in);
		System.out.println("Enter a number value");
		int a =calc.nextInt();
		System.out.println("Enter b number value");
		int b =calc.nextInt();
		int c=cal.sum(a, b);
		int d=cal.sub(a, b);
		int e=cal.div(a, b);
		int f=cal.mult(a, b);
		System.out.println("Sum is: "+c+"\n"+"Substraction is: "+d+
		"\n"+"Division is: "+e+	"\n"+"Multiplication is: "+f);
		

}
}