package com.class19;

public class Application {

	public static void main(String[] args) {
		/*Create another class called Application
from this application class create 3 different instances/objects of
 it and print the properties and functions/methods*/
		
		
		Animal dog1=new Animal();
		
		System.out.println("This is Animal 1");
		System.out.println(dog1.age);
		System.out.println(dog1.weight);
		System.out.println(dog1.breed);
		System.out.println(dog1.name);
		dog1.name="Joe";
		dog1.age=40;
		System.out.println(dog1.age);
		Animal.canBark();
		System.out.println(Animal.canBark());
		dog1.isWild();
		System.out.println(dog1.isWild());
		
		Animal dog2=new Animal();
		System.out.println("This is Animal 2");
		System.out.println(dog2.age);
		System.out.println(dog2.weight);
		System.out.println(dog2.breed);
		System.out.println(dog2.name);
		
		Animal dog3=new Animal();
		System.out.println("This is Animal 3");
		System.out.println(dog3.age);
		System.out.println(dog3.weight);
		System.out.println(dog3.breed);
		System.out.println(dog3.name);
		
		
	}

}
