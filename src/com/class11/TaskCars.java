package com.class11;

public class TaskCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][]cars= {
				
				{"Ford", "Chevrolet","Jeep"},
				{"BMW", "Posche","Audi"},
				{"Hundai", "Kia", "Daewoo"},
				{"Ferrari", "Lamborgini","Fiat"}
				
				
		};
		for (int i=0; i<cars.length; i++) {
			for (int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
			}
			System.out.println();
		}
	}

}
