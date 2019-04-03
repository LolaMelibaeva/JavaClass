package com.class15;

public class PracticeQ2 {

	public static void main(String[] args) {
		
//2.Write a java program to find the second largest number in the array?
		//Maximum and minimum number in the array?
		
		
		int [] arr= { 1000, 46, 1,3458, 86, 292, 2, 1254};
		int max=arr[0];//=1
		int max2=arr[0];//=1
		
		
		for (int a : arr) {
			if (a > max) {
				max=a;
			}else if (max<a && max2>a) {
				max=max2;
				max2=a;
			
			}
			
		}System.out.println(max + " is a max number");
		System.out.println(max2 + " is a 2nd max number");
	
	}

}
