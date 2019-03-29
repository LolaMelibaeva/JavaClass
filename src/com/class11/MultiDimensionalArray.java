package com.class11;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		//Creating 2d array
		
		int [][]d=new int [4][4];
		
		//1 row
		d[0][0]=12;
		d[0][1]=13;
		d[0][2]=14;
		d[0][3]=15;
		//2 row
		d[1][0]=1;
		d[1][1]=2;
		d[1][2]=3;
		d[1][3]=4;
		//3 row
		d[2][0]=5;
		d[2][1]=10;
		d[2][2]=15;
		d[2][3]=20;
		//4 row
		d[3][0]=100;
		d[3][1]=200;
		d[3][2]=300;
		d[3][3]=400;
		System.out.println(d[1][2]);//3
		System.out.println(d[2][3]);//20
		
		
		System.out.println();
		
		
		int [][] e= { 
				{12,13,14,15}, 
				{1,2,3,4}, 
				{5,10,15,20},
				{100,200,300,400}
				
		};
		System.out.println(e[3][1]);//200
		System.out.println(e[0][0]);//12
		System.out.println();
		
		String [][]groups= {
				{"Andrei", "Artem", "Julia", "Zoya"},
				{"Bilal","Shaban", "Asmit", "Sasha", "Olga", "Moe"},
				
		};
		
		System.out.println(groups [1][5]);
		
		
		
		
		
		
		
	}

}
