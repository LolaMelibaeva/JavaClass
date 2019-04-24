package com.class26;

public class Shape {
	int radius;
	Shape (int radius){
		this.radius=radius;
	}

}
class Circle extends Shape {
	
	
	
	Circle (int radius){
	super(radius);
    	}
	
	public void printArea() {
		double area=3.14*radius*radius;
	    System.out.println(area);

	}
}

class TestShape{
	public static void main(String[] args) {
		
		Circle obj=new Circle(10);
		obj.printArea();
	}
}