package com.class16;

public class Main {

	 String Color, Name;
	  int ModelYear;
	public static void main (String [] args){
	  Main car=new Main ();
	  car.Color="Black";
	  car.ModelYear=2019;
	  car.Name="BMW";
	  
	  Main car2=new Main ();
	  car2.Color="White";
	  car2.ModelYear=2018;
	  car2.Name="Toyota";
	  System.out.println("Car color "+car.Color+" car model year "+car.ModelYear+" car name is "+car.Name);
	  System.out.println("Car color "+car2.Color+" car model year "+car2.ModelYear+" car name is "+car2.Name);
	}
	}


