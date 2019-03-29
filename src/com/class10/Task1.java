package com.class10;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*1.Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways 
 * of creating an array).
 
 */
		char [] grades=new char[6];
		grades [0]='A';
		grades [1]='B';
		grades [2]='C';
		grades [3]='D';
		grades [4]='E';
		grades [5]='F';
		
		
		char []grades1= {'A','B','C','D','E','F'};
		
		System.out.println(grades[1]);
		System.out.println(grades1[1]);
		
		String [] names=new String[4];
		names[0]="John";
		names[1]="Mike";
		names[2]="Sean";
		names[3]="Lola";
		
		String []names1= {"John", "Mike", "Sean", "Lola"};
		
		System.out.println(names[3]);
		System.out.println(names[3]);
		
		
		String [] syntax= {"Java","Saturday","day","coding", "is"};
		System.out.println(syntax[1]+" "+syntax[4]+" "+syntax[0]+" "+syntax[3]+" "+syntax[2]);
	
		int size=syntax.length;
		System.out.println("The size of an array is " + size);
	}

}
