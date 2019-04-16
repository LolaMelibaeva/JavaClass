package com.class22;

public class ConstructorTypes {

	
	ConstructorTypes(){
		System.out.println("I am a constructor with NO paramaters");
	}
	
	ConstructorTypes(String str){//str - is a local variale to a constructor
		System.out.println("I am a constructor with 1 parameter"+str);
	}
	
	ConstructorTypes(int a, String str){
		System.out.println("I am a constructor with 2 parameters "+a+" and "+str);
	}
	public static void main(String[] args) {
		ConstructorTypes obj1 = new ConstructorTypes ();
		ConstructorTypes obj2 = new ConstructorTypes ("String");
		ConstructorTypes obj3 = new ConstructorTypes (123, "String");
	}
}
