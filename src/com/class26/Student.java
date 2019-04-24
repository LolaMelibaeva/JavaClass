package com.class26;

public class Student {
	
	String name, address;
	
	Student (String name, String address){
		this.name=name;
		this.address=address;
	}
	
	public void displayInfo() {
		System.out.println(name+"\n"+address);
	}
}

class TestStudent{
	
	public static void main(String[] args) {
		
		
		Student obj=new Student ("John Snow", "78 Main Street, Vienna, VA");
		obj.displayInfo();
	}
}