package com.class14;

public class ToCharArray {
public static void main(String[] args) {
	
	
	String str="saturday";
	char[] array=str.toCharArray();
	for (int i=0; i<array.length; i++) {
		System.out.println(array[i]);
	}	
	
	
	for (int k=array.length-1; k>=0; k--) {
		System.out.print(array[k]);
	}
	
	
}
}