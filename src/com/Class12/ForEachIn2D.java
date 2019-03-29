package com.Class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		
		/*Create a grocery list: fruits{}
         *                         veggies{}
         *                         dairy{}
         * Retrive all values using 2 different loops*/
		 
		String [][] list= {
				
				{"apple", "pear", "mango", "grapes"},
				{"tomato", "potato", "onion", "radish"},
				{"milk", "cheese", "yogurt", "butter"},
				
		};
		
		for (int i=0; i<list.length; i++) {
			for (int j=0; j<list[i].length; j++) {
			System.out.print(list[i][j]+" ");
		}System.out.println();
		}System.out.println("--------The 2nd way to loop-------");

		for (String []grocery:list) {
			for (String food: grocery) {
				System.out.print(food+" ");
			}
			System.out.println();
		}
	}
	}

