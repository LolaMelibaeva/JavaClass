package com.class11;

public class Task2D1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Create a 2D array where you will store the following values:
 *  Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
After storing values print the following:
Mrs Smith, Mr Obama, Ms Jackson.*/
		
		
		String [][]title= {
				
				
				{"Mr", "Mrs", "Ms", "Miss"},
				
				{"Smith", "Jordan", "Jackson", "Obama"}
		};
		
		System.out.println(title [0][2]+" "+ title [1][0]);
		System.out.println(title [0][0]+" "+ title [1][3] );
		System.out.println(title [0][2]+" "+ title [1][2] );
		System.out.println(title [0][3]+" "+ title [1][1] );
		}
	}


