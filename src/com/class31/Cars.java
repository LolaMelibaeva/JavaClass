package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> list=new ArrayList<String>();
		list.add("Mazda");
		list.add("Toyota");
		list.add("BMW");
		list.add("Audi");
		list.add("Volvo");
		System.out.println("-----For Loop------");
		for (int i=0; i<list.size();i++) {
			System.out.print(list.get(i)+", ");
		}
		System.out.println();
		
		System.out.println("------Enhanced Loop----");
		
		for (String obj: list) {
			System.out.print(obj+", ");
		}
		System.out.println();
		
		System.out.println("-------Using Iterator Method-----");
		
		Iterator<String> iter=list.iterator();
		while( iter.hasNext()) {
			System.out.print(iter.next()+", ");
		}
		System.out.println();
		
		System.out.println("-------Using While Loop-------");
		int a=0;
		while (list.size()>a) {
			String cars=list.get(a);
			System.out.print(cars+", ");
			a++;
		}
	}

}
