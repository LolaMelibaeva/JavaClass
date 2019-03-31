package com.class15;

public class ZakiLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {10,26,15,8,14,27};
	        
	        int min = arr[0];
	        int max =arr[0];
	        int secondMax = arr[0];
	        
	        for(int a : arr) {
	            
	            if(a < min) {
	                min = a;
	                
	            }else if(a > max) {
	                secondMax = max;
	                max = a;
	                
	            }else if(a > secondMax) {
	                secondMax = a;
	            }
	        }
	        
	        System.out.println("Min: "+min);
	        System.out.println("Max: "+max);
	        System.out.println("Second Max: "+secondMax);
	    }

	}

