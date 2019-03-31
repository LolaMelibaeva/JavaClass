package com.class14;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reverse a string without using a reverse function
		
		String original ="Today is Java Class";
		String reverse="";
		char[] array=original.toCharArray();

		for (int i=array.length-1; i>=0; i--) {
			reverse+=array[i];}
			System.out.print("Reversed String is: "+reverse);
			System.out.println();
		
		
		//2 charAt()
		
		String reverse1="";
		for (int i=original.length()-1; i>=0; i--) {
			reverse1+=original.charAt(i);
		}System.out.println("\nReversed String is: "+ reverse1);
		
		
		
		//using substring()
		
		  reverse="";
	        for(int i = original.length(); i>0; i--) {
	        	reverse+=original.substring(i-1,i);
	        }System.out.print("\nReverse String is: " +reverse);
	        
	}

}
