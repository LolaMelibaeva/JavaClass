package com.class13;

public class StringExecise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
	        * Write a program that:
	        * Converts all the characters in the string to lower case and prints.
	        * Converts all the characters in the string to upper case and prints.
	        * Checks whether the string/paragraph starts and ends with the string or word "The" and prints.
	        * Counts the number of letter 'a' in the string/paragraph and prints.
	        * Prints the second half of the string/paragraph.
	        * Prints characters between the 10th and 20th indices(inclusive).
	        * Prints the string/Paragraph in reverse order.
	        * Clears/removes all white spaces or tabs on both ends and prints.
	        */

	       String para = "The quick brown fox jumps over the lazy dog.";
	       String para1=para.toLowerCase();
	       System.out.println(para1);
	       System.out.println();
	       
	       String para2=para.toUpperCase();
	       System.out.println(para2);
	       System.out.println();
	       
	       boolean para3=para.startsWith("The");
	       System.out.println(para3);
	       System.out.println();
	       
	       boolean para4=para.endsWith("The");
	       System.out.println(para4);
	       System.out.println();
	       
	       int count=0;
	       for (int i=0; i<para.length(); i++) {
	    	   if (para.charAt(i)=='a') {
	           count++;
	           }
	       }
	       System.out.println("Counts number of 'a' is : " +count);
	       System.out.println();
	       
	     
	       System.out.println(para.substring(para.length()/2));
	       System.out.println();
	       
	       String para7=para.substring(10,20);
	       System.out.println(para7);
	       System.out.println();
	       
	       
	       for(int j = para.length() - 1; j >= 0; j--){
	        
	            
	        
	        
	        System.out.print(para.charAt(j));}
	        System.out.println();
	        
	       String para9=para.trim();
	       System.out.println(para9);
	       System.out.println();
	       
	       
	}

}

