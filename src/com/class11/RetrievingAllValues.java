package com.class11;

public class RetrievingAllValues {

	public static void main(String[] args) {
		
		int [][]num= {
				{11,12,13,14},
				{21,22,23},
				{31,32,33,34},				
				
		};
		for (int row=0; row<num.length; row++) {
			for (int col=0; col<num[row].length; col++) {
				System.out.print(num[row][col]+" ");
			}
			System.out.println();
		}
		String [][] food= {
				{"burger","fries", "hotdog", "meatlof"},
				{"lomein", "fried-rice", "white-rice"},
				{"biriyani", "korma", "naan", "chickpeas"}
				
			};
		for (int row=0; row<food.length; row++) {
			for (int col=0; col<food[row].length; col++) {
				System.out.print(food[row][col]+" ");
			}
			System.out.println();
		}
	}

}
