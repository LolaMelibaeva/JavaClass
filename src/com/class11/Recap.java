package com.class11;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//lets create an array of names that will hold 5 elements and retrieve all values from it
		
		String []  names= {"John", "Mike", "Paul", "Hugo", "Luca"};
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println();
		//2. Create an array using array literal
		
		String [] studentsNames= new String [6];
		
		studentsNames[0]="Shaban";
		studentsNames[1]="Bilal";
		studentsNames[2]="Mehmet";
		studentsNames[3]="Zaki";
		studentsNames[4]="Samir";
		studentsNames[5]="Frank";
		System.out.println("-------For loop--------");
		for (int i=0; i<studentsNames.length; i++) {
			System.out.println(studentsNames[i]);
			}
		System.out.println("------Advanced for loop----------");
		for (String student : studentsNames) {
			System.out.println(student);
		// retrieve values using: advanced for loop, for each loop, enhanced for loop
		
		
		
		
		
		
		
		}	
		
	}

}
