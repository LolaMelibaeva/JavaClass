package com.class21;

public class Employee {
	
	
	/*Create a Class called Employee:
Create three  variables  eID , salary and set the CEO to “Sumair”
Create two objects of the class Employee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects*/
	
	
		public int eID;
		public double salary;
		static String CEO="Sumair";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Employee emp1=new Employee ();
			emp1.eID=1;
			emp1.salary=80000.00;
			Employee.CEO="Sumair";
			emp1.getProperties();
			System.out.println();
			
			Employee emp2=new Employee ();
			emp2.eID=2;
			emp2.salary=90000.00;
			Employee.CEO="Sumair";
			emp2.getProperties();
			
	}
	public void getProperties() {
		System.out.println("Employee ID is "+ eID+"\nEmployee Salary is "+salary+"\nCompany CEO is "+CEO);
	}

}
