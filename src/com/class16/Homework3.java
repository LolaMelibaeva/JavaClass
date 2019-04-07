package com.class16;

public class Homework3 {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="12345";
		char str1=s1.toCharArray();
		char []str2=s2.toCharArray();
		for (int i=0; i<str1.length-1; i++) {
			for (int j=0; j<str2.length-1; j++) {
				System.out.println(str1[i]+str2[j]);
			}
	}
}
}