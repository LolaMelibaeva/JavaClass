package com.class13;

public class AverageValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[][] rating = { {   2, 6, 9, 3, 7 },
				   				{ 1, 7, 9, 4, 8 },
				   				{ 0, 4, 6, 2, 5 }, 
				   				{ 0, 1, 2, 3 } };
		   double sum=0;
		   double ave=0;
		 
			   for (int j=0; j<rating.length;j++) {
			   sum+=rating[j][2];
			   ave=sum/rating.length;
		   
			   }System.out.println(ave);

}
}