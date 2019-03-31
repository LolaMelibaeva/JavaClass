package com.class14;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    
	    int [] arr= {10, 20, 34, 43, 76, 2, 4 ,54, 80};
	    int max=arr[0];
	    int min=arr[0];
	    int max2=arr[0];
	    int max3=arr[0];
	    
	    for (int i=0; i<arr.length; i++) {
	    	if (arr[i]>max) {
	    		max2=max;
	    		max=arr[i];
	    	}else if (arr[i]>max2) {
	    			max2=arr[i];
	    	
	    	
	    		}else if (arr[i]<min) {
	    			min=arr[i];
	    		}
	    
	   
	    } System.out.println("Max value is "+max);
	    System.out.println("2nd max value is "+max2);
	    System.out.println("Min value is " + min);
	   
	   
}
}
