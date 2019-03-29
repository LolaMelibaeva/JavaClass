package com.class13;

public class AverageRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[][] ar = { { 2, 6, 9, 3, 7 },
				 { 1, 7, 9, 4, 8 },
				 { 0, 4, 6, 2, 5 },
				 { 0, 1, 2, 3 } };
		double sum=0;
		double ave=0;
		for (int i=0; i<ar[1].length; i++) {
			sum+=ar[1][i];
			ave=sum/ar[1].length;
			
		}System.out.println(ave);
	}

}
