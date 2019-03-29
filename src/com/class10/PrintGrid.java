package com.class10;

public class PrintGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]array=new int[10][10];
		
		
		for (int i=1; i<=array.length; i++) {
			for (int j=1; j<=array.length; j++) {
				System.out.print("-");
				
			}
			System.out.println();
		}
	}

}
