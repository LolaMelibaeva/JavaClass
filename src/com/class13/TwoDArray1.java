package com.class13;

public class TwoDArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] ar= {{1,2,3},
					{4,5,6,9},
					{7,8}};
		
		for (int i=0; i<ar.length; i++) {
			for (int j=0; j<ar[i].length; j++) {
				System.out.print(ar[i][j]+" ");	
			}System.out.println();
		}
		
		for (int [] num: ar) {
			for (int num1: num){
				
			System.out.print(num1 +" ");
				}System.out.println();
	}
	}
}
