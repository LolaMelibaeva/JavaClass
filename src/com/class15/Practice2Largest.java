package com.class15;

public class Practice2Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {15,16,18,19,13,189,200};
		int max=arr[0];
		int max2=arr[0];

		for ( int i=0; i<arr.length; i++) {
				
		if (arr[i]>max) {
			max2=max;
			max=arr[i];
			
		}else if (arr[i]>max2) {
			max2=arr[i];
		}}
	System.out.println(max+" is a max value in the array");
	System.out.println(max2+" is a max2 value in the array");
	
	double result=Math.sqrt(max2);
		
}
}