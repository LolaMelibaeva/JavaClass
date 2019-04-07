package com.class17_2;

public class Main2 {
	public static String mixString (String s1, String s2)
	{
	String res="";
		for (int i=0; i<s1.length(); i++) {
			
			res=res+s1.charAt(i)+s2.charAt(i);
	       
			 
		}
	  return res;
}


	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(mixString("12345","abcde")); //should be 1a2b3c4d5e
		System.out.println(mixString("howdy","hello")); //should be hhoewldlyo
	}
}