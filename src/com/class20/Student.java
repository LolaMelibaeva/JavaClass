package com.class20;

public class Student {
	public static void main(String[] args) {
		
		Student obj=new Student();
		char grade=obj.getGrade(90);
		System.out.println(grade);
	}
	
	
	 char getGrade (int score) {
		 char grade;
		if (score >=90) {
			grade='A';
		}else if (score<90) {
			grade='B';
			
		}else if (score<80) {
			grade='C';
			
		}else if (score<70) {
			grade='D';
		}else {
			grade='F';
		}
		return grade;
	}
	
} 

