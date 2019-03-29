package com.class8;

public class Animal {
	
	
	{
	  System.out.println("In instance block");
	 }
	 static{
	  System.out.println("In Static block");
	 }
	  public Animal(){
	  System.out.println("In Default constructor");
	 }
	 public static void main(String[] args) {
	  Animal a = new Animal();
	 }
	}

