package com.class10;

public class FindMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* * Write a program to find the index of an array element.
        

* Write a program to find the maximum and minimum value of an array.*/
		
		int[] arr = { 5, 8, 3, 7 , 15, 25,45,78,94,1};
		int max=arr[0];
		int min=arr[0];

		for (int i = 0; i <arr.length; i++)
		{
		     if (arr[i]>max){
		    	 max=arr[i];
		     }else if 
		    	 (arr[i]<min) {
		    	 min=arr[i];
		     }
		}
		System.out.println("Maximum value in the array is: "+max);
		System.out.println("Minimum value in the array is: "+ min);
	}
}

