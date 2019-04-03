package com.class16;

public class PrimeNumberMethod {

	public static void main(String[] args) {
		 for(int i = 1; i <= 500; i++)
	        {
	            if(isPrime(i))
	            {
	                System.out.print(i + " ");
	            }
	        }    
	    }

	    public static boolean isPrime(int number)
	    {
	        for(int i = 2; i < number; i++)
		{
		    if(number % i == 0)
	            {
	                return false;
	            }
	        }
	        
	        return true;
	    }
	}
	      

