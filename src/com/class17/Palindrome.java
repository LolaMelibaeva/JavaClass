package com.class17;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome word=new Palindrome();
		word.isPalindrome("kayak");
	}
	void isPalindrome (String a) {
		
		char []arr=a.toCharArray();
		String reverse="";
		for (int i=0; i<arr.length; i++) {
			reverse+=arr[i];
		}if (reverse.equalsIgnoreCase(a)) {
				System.out.println(a+" is a Palindrome word");
			}else {
				System.out.println(a+ " is NOT a Palindrom word");
			}
	}

}

