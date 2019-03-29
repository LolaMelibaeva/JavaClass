package com.class13;

public class StringManipulation {

	public static void main(String[] args) {
		
		int [][] arr= {{1,2},{3,4},{5,6}};
		int sum=0;
		for (int i=0; i<arr[1].length; i++) {
			System.out.println((arr[0][i]));
			sum+=arr[1][i];
			
		}System.out.println(sum);
		

	}

}
