package com.class29;

abstract class Marks1 {
	public abstract double getPercentage();
	
}
class StudentA extends Marks1{
	int mark1, mark2, mark3;
	public  StudentA(int mark1, int mark2, int mark3) {
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}


	@Override
	public double getPercentage() {
		double perc=(mark1+mark2+mark3)/3;
		return perc;
	}
}
class StudentB extends Marks1{
	int mark1, mark2, mark3, mark4;

	 StudentB(int mark1, int mark2, int mark3, int mark4) {
	this.mark1=mark1;
	this.mark2=mark2;
	this.mark3=mark3;
	this.mark4=mark4;
	}

	@Override
	public double getPercentage() {
		double perc=(mark1+mark2+mark3+mark4)/4;
		return perc;
		
	}
}
class MarksTest {
	
	public static void main(String[] args) {
		
		Marks1 obj=new StudentA(60,70,80);
		System.out.println(obj.getPercentage());
		
		Marks1 obj1=new StudentB(80,90,85,99);
		System.out.println(obj1.getPercentage());
	}
}

	