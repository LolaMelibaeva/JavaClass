package com.class21;

public class Students {
	
	/*Create three  variables  studentName , studentID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students*/
	
		public String studentName;
		public int studentID;
		static int numberOfStudents;
	

	public static void main(String[] args) {
		
		
		Students stu1=new Students ();
		stu1.studentName="John Smith";
		stu1.studentID=145461;
		Students.numberOfStudents++;
		stu1.print();
		System.out.println();
		
		Students stu2=new Students ();
		stu2.studentName="Anna Brown";
		stu2.studentID=145462;
		Students.numberOfStudents++;
		stu2.print();
		System.out.println();
		
		Students stu3=new Students ();
		stu3.studentName="Paul White";
		stu3.studentID=145463;
		Students.numberOfStudents++;
		stu3.print();
		
		
		
		
	}
	void print () {
		System.out.println("Student name is "+studentName+"\n"+
	"Student ID is AA"+studentID+"\n"+"Total Number is "+numberOfStudents);
	}

}
