package com.class24_2_2;

public class Parent {
	
	
	Parent (){
		//System.out.println(" I am a constructor from a Parent class");
	}
	 public String isReverse (String str) {
		String rev ="";
		 for (int i=str.length()-1; i>=0; i--) {
		 rev=rev+str.charAt(i);
		 
		 
	 }return rev;
	 }
		 public String isReverse (String str, String str1) {
			 String rev="";
			 for (int i=str.length()-1; i>=0; i--) {
				 
			 
			 rev=rev+str.charAt(i)+str1.charAt(i);
			 
			 
			 }
			 return rev;
		 }
}