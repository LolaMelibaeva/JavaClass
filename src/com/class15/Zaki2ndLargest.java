package com.class15;

public class Zaki2ndLargest {

	public static void main(String[] args) {
		int[] arr = {1000,10,260,15,14,0,27,384,999};
		
		int min = arr[1];
		int max =arr[1];
		int secondMax = arr[1];
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] < min) {
				min = arr[i];
				
			}else if(arr[i] > max) {
				secondMax = max;
				max = arr[i];
				
			}else if(arr[i] > secondMax) {
				secondMax = arr[i];
			}
		}
		
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
		System.out.println("Second Max: "+secondMax);

	}

}
