package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveLetterE {

	public static void main(String[] args) {
		
		
		ArrayList<String> words= new ArrayList<String>();
		
	words.add("George");
	words.add("Hello");
	words.add("Bye");
	
	Iterator <String> list=words.iterator();
	while(list.hasNext()) {
		String newList=list.next();
		if(newList.endsWith("e")) {
			list.remove();
			
		}
		
	}
	System.out.println(words);
	}

}
