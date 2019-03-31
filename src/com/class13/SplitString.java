package com.class13;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Lola");

		//Splitting with limit as 0
		String arr2[]= s.split("a", 0);
		System.out.println("Zero Limit split:");
		for (String str2: arr2){
		   System.out.println(str2);
		}

		//Splitting with negative limit
		String arr1[]= s.split("a", -1);
		System.out.println("Negative Limit split:");
		for (String str: arr1){
		   System.out.println(str);
		}

	       System.out.println("End of program");
	}

}
