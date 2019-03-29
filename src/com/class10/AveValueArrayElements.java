package com.class10;

public class AveValueArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ave=0; int sum=0;
		int [] array= {5,8,45,12,45,78,49,12,32,65};
		
		for (int i=0; i<array.length; i++){
						
		sum+=array[i];
		ave=(sum/array.length);
		}
		
		System.out.println("The average value of array elements is: " + ave);
		
	}

}
