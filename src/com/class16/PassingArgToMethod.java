package com.class16;

public class PassingArgToMethod {

	
		/*
		 * This program demonstrate passing
		 * argument to a method.
		 */
		
		   public static void main(String[] args){
		   {
		      int x = 30;

		      System.out.println("Display line of 50 characters");
		      displayLine(50);
		      System.out.println("Display line of 30 characters");
		      displayLine(x);
		   }}

		   /**
		    *  The displayLine method accept an argument.
		    */
		   public static void displayLine(int n)
		   {
		      for (int i = 1; i <= n; i++)
		      {
		         System.out.print("o");
		      }

		      System.out.println(" ");
		   }
		}          

