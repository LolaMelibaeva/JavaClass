package com.class15;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 2000, 20,30,60,90,100, 0, 1000,1547};
	       int largest = array[6];
	       int secondLargest = array[6];

	       for (int i = 0; i < array.length; i++) {

	           if (array[i] > largest) {
	               secondLargest = largest;
	               largest = array[i];

	           } else if (array[i] > secondLargest) {
	               secondLargest = array[i];

	           }
	       }
	                 System.out.println("Second largest number is:" + secondLargest);
	}

}
