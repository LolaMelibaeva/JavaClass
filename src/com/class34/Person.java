package com.class34;
/*Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map to store personId and a Person Object. Print each object details.*/

public class Person {

		public String name, lastName;
		public int age, salary;
		
		public Person(String name, String lastName, int age, int salary) {
			this.name=name;
			this.lastName=lastName;
			this.age=age;
			this.salary=salary;
						
		}
		public void printUserDetails() {
			System.out.println("User name is "+name+"\nUser lastname is "+lastName+"\nAge is "+age+"\nSalary is "+salary);
		}
}
