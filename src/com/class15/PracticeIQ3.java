package com.class15;

public class PracticeIQ3 {

	public static void main(String[] args) {
		//3. Find out how many alpha characters present in a string?
		
		String a="234L *(o909 la9099!@@";
		String a1=a.replaceAll("[^a-zA-Z]","");
		System.out.println(a1+" has "+a1.length()+" characters");
			

	}

}
