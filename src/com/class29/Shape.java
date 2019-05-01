package com.class29;

public interface Shape {
	
	void calculateArea (double num);
	void calculatePerimeter(double num);

}
class Circle implements Shape{

	@Override
	public void calculateArea(double num) {
		
		double area=3.14*num*num;
		System.out.println(area);
		
	}

	@Override
	public void calculatePerimeter(double num) {
		
		double perimeter=2*3.14*num;
		System.out.println(perimeter);
		
	}
	
}
class Square implements Shape{

	@Override
	public void calculateArea(double num) {
		
		double areasquare=num*num;
		System.out.println(areasquare);
	}

	@Override
	public void calculatePerimeter(double num) {
		
		double perimetersquare=4*num;
		System.out.println(perimetersquare);
		
	}
	
}
class TestShape{
	public static void main(String[] args) {
		
		Circle obj=new Circle();
		obj.calculateArea(10.5);
		obj.calculatePerimeter(10.5);
		
		
		Square obj1=new Square();
		obj1.calculateArea(5);
		obj1.calculatePerimeter(5);
	}
}
