package com.class18;
import java.lang.*;
public class Main {
	public static String mixString (String s1, String s2) {
	
			
			 String s="";
			 for (int i=0; i<s1.length(); i++) {
				 
		        s1.charAt(i);
		        System.out.println(s1);
			 
		       
		       
		}
				
		       
			}
	
		
		


	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(mixString("12345","abcde")); //should be 1a2b3c4d5e
		System.out.println(mixString("howdy","hello")); //should be hhoewldlyo
	}
}