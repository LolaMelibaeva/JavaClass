package com.class11;

public class Largest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//Create an array of integers and find the largest element
		
		int [] num= {2,15,45,78,65,157,8,9,15,4,63};
		int max=num[0];
		int min=num[0];
		for (int i=0; i<num.length; i++) {
			
			if(num[i] > max){
	          max = num[i];
	         
			}else if (num[i]<min) {
				min=num[i];
		}
		}
		
		System.out.println("The largest element is: " +max);
			System.out.println("The smallest element is: " + min);
}
			
	}
