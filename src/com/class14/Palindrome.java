package com.class14;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        
	    String str = "madam";
	    String reverse = "";
	    
	    for (int i=str.length()-1; i>=0; i--) {
	        reverse+=str.charAt(i);
	    } System.out.println(reverse);
	      
	    if (reverse.equalsIgnoreCase(str)) {
	        System.out.println(str+ " is a Palindrome");
	        } else {
	            System.out.println("Not a Palindrome");
	        }
	}

}
