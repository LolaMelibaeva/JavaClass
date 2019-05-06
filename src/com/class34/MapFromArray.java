package com.class34;
import java.util.*;
import java.util.Map.Entry;
public class MapFromArray {

	public static void main(String[] args) {


		String[] names= {"Mehmet","Asha", "Amina", "Omar", "Siyar", "Danny"};
		
		Map<Integer, String> nameMap=new LinkedHashMap<>();
		
		int key=1;
		for(String name:names) {
			nameMap.put(key, name);
			key++;
			
		}
		System.out.println(nameMap);

	
	//print key and value using entrySet(loop && iterator)
	System.out.println("Printing entrySet using for loop");
	for (Entry<Integer, String> name : nameMap.entrySet()){
		System.out.print(name.getKey()+":"+name.getValue()+" ");
	}
	System.out.println();
	System.out.println("Printing entrySet using Iterator");
	
	Iterator<Entry<Integer, String>> it = nameMap.entrySet().iterator();
	while(it.hasNext()) {
	Entry<Integer, String> entry=it.next();
	System.out.print(entry.getKey()+"=="+entry.getValue()+" ");
	}
}
}