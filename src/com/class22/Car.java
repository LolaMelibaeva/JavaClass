package com.class22;

public class Car {
	public static String make="Toyota";
	String color;
	String model;
	int doors;
	boolean engine;
	
	Car (){
		
		System.out.println("I am a constructor");
		System.out.println("Hello from constructor");
	}
	//access modifier  non-access modifier(makes a class method)   return type  name of a method   parameters array of Strings with name args
	public             static                void         main              (String[] args) {
	
		
		/* Car obj= new Car();
		 * Car - Class Name
		 * obj -reference variable/object name
		 * = - assigning operator
		 * new -keyword that creates an object
		 * Car()-constructor
		 * Constructor-helps us to initialize an object and assign default value;
		 */
		Car obj=new Car ();
		System.out.println(obj.color);
		System.out.println(obj.doors);
		System.out.println(obj.engine);
		hello();
		
	}
	
	public static void hello() {
		System.out.println("I am a static hello method");
	}

}
