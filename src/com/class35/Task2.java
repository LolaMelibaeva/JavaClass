package com.class35;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		
		List<Exception> exceptionList=getList();
		System.out.println(exceptionList.size());
		
		for (Exception singleException : exceptionList) {
			System.out.println(singleException);
		}
		
	}

	public static  List <Exception> getList(){
		List<Exception> list =new ArrayList();
		try {
		System.out.println(10/0);
		}catch(ArithmeticException e) {
			list.add(e);		}
		int [] array= {12,13};
		
		try {
			System.out.println(array[2]);
		}catch (ArrayIndexOutOfBoundsException e1) {
			list.add(e1);
		}
		Scanner scan=new Scanner (System.in);
		System.out.println("Please, enter a number");
		
		try {
			int num=scan.nextInt();
			
		}catch (InputMismatchException e2) {
			list.add(e2);
		}
		
		String str=null;
		
		try {
			System.out.println(str.length());
		}catch (NullPointerException e3) {
			list.add(e3);
		}
		
		return list;	
		
	}

}
