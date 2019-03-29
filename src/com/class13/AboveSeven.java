package com.class13;

public class AboveSeven {

	public static void main(String[] args) {
		//  Find the number of values above the value of 7.
		 int[][] ar = { { 2, 6, 9, 3, 7 },
				 { 1, 7, 9, 4, 8 },
				 { 0, 4, 6, 2, 5 },
				 { 0, 1, 2, 3 } };
		 int count=0;
		 for (int i=0; i<ar.length; i++) {
			 for (int j=0; j<ar[i].length; j++) {
				 if (ar[i][j]>7) {
					 count++;
					 
				 }
			 }
		 }System.out.println(count);

	}

}
