package com.class6;

import java.util.Scanner;

public class Homework0303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Using scanner class create calculator. allow user to enter 2 numbers and operator(+,-,*,/). 
 * Based on operator provide   the result to user*/
 
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter two numbers");		
		
        double firstnum = sc.nextDouble();
        double secondnum = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;

        switch(operator)
        {
            case '+':
                result = firstnum + secondnum;
                break;

            case '-':
                result = firstnum - secondnum;
                break;

            case '*':
                result = firstnum * secondnum;
                break;

            case '/':
                result = firstnum / secondnum;
                break;
                
            default:
                System.out.printf("Invalid");
                return;
        }

        System.out.println(firstnum + "" + operator+ ""+ secondnum +"=" + result);
        System.out.printf("%.1f %c %.1f = %.1f", firstnum, operator, secondnum, result);
    }
    }           