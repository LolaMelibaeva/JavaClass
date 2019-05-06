package com.class33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupl {
	public static void main(String[] args) {
		
	
	List<String> aList=new ArrayList<String>();
    aList.add("John");
    aList.add("Jane");
    aList.add("James");
    aList.add("Jasmine");
    aList.add("Jane");
    aList.add("James");
    System.out.println("Collection before removing duplicates: "+aList);
    
    Set<String> hset=new LinkedHashSet<String>(aList);
    System.out.println("Collection after removing duplicates: "+hset);
	}
}
