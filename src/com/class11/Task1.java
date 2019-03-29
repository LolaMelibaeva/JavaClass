package com.class11;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []cars= {"BMW", "Mazda", "Honda", "Toyota","Lada","Jiguli"};
		for (int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+" ");				
		}
		System.out.println();
	
		for (String car: cars) {
			System.out.print(car+" ");
		}
	}

}
