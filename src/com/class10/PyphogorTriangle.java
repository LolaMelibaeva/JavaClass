package com.class10;

public class PyphogorTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 6;

	      for (int i = 1; i <= SIZE; i++)
	      {
	         for (int j = 1; j <=i; j++)
	         {
	            System.out.print("*");
	         }

	         System.out.println();
	      }
	      
	      
	      for (int i = 1; i <= 10; i++)
	      {
	         if (i % 2 == 0)
	         {
	        	 continue;}

	         System.out.println(i + " ");
	      }
	   }
	}

	   