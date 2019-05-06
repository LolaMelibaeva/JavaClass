package com.class31;
/*A university department consists of professors and secretaries. Each professor and each secretary
 *  has a name, a salary, and a hire date. Use inheritance and polymorphism to create an application
 *   that represents the department and its professors and secretaries as objects, and provides a test
 *    class that creates 3 professors and 2 secretaries, and then outputs the combined total of all of 
 *    their salaries.
 */
public abstract class Department {
	String name, hdate;
	double salary;
	
	
	Department(String name, double salary, String hdate){
		this.name=name;
		this.salary=salary;
		this.hdate=hdate;	}	
	
}
	class Child extends Department{

	Child(String name, double salary, String hdate) {
		super(name, salary, hdate);
		// TODO Auto-generated constructor stub
		System.out.println("Name: "+name+" Salary "+salary+" Hire Date: "+hdate);
		}		
	}

class TestDepartment{
	public static void main(String[] args) {
		
		Child prof1=new Child("Dr.Smith John",100000.0, "01/01/2000");
		Child prof2=new Child("Dr.Brown Ann Mary",190000.0, "01/11/2010");
		Child prof3=new Child("Dr.White William",150000.0, "05/01/1995");
		Child secr1=new Child("Pam Culpo",50000.0, "03/01/2018");
		Child secr2=new Child("Martha Steward",60000.0, "07/15/2000");
		
		double totalSalary=prof1.salary+ prof2.salary+prof3.salary+secr1.salary+secr2.salary;
		System.out.println("Total combined salary of Departement employees is "+ totalSalary);
		
	}
}
