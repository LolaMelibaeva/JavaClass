package com.class30;

public class Car {
	
	String color;
	double carPrice;
	
	public Car(String color, double carPrice) {
		this.color=color;
		this.carPrice=carPrice;
	}
	public double calculateSalePrice() {
		return carPrice;
	}
}
class Truck extends Car{
	
	int weight;
	

	public Truck(String color, double carPrice, int weight) {
		super(color, carPrice);
		this.weight=weight;
		
	}
	public double calculateSalePrice() {
		if (weight>2000) {
			carPrice-=carPrice*.1;
		}else {
			carPrice-=carPrice*.2;
		}
		return carPrice;
	
}
}
class Sedan extends Car{
	 double length;
	public Sedan(String color, double carPrice, double length) {
		super(color, carPrice);
		this.length=length;
	}
	public double calculateSalePrice() {
		if (length>20) {
			carPrice-=carPrice*.05;
		}else {
			carPrice-=carPrice*.1;
		}
		return carPrice;
	}
		
}

class CarTest{
	public static void main(String[] args) {
		
		Car obj= new Truck ("blue", 25000, 3000);
		System.out.println(obj.calculateSalePrice());
		
		Car obj1=new Sedan("white", 15000, 25);
		System.out.println(obj1.calculateSalePrice());
		}
}