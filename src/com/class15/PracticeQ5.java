package com.class15;

public class PracticeQ5 {

	public static void main(String[] args) {
		
//5. Write a java program to reverse String? Reverse a string word by word?
	//	String arr="It is Monday!";
	//	String [] a=arr.split(" ");
	//	String reverse="";
		//for (int i=a.length-1;i>=0; i-- ) {
			//reverse+=a[i];
		//	System.out.print(a[i]+" ");
			
			
		//	}
		//}
	
		String a="Tomorrow is Tuesday!";
		String reverse="";
		for (int i=a.length()-1; i>=0; i--) {
			reverse+=a.charAt(i);
		}System.out.println(reverse);
			
		}
		
	}


