package com.class34;
import java.util.*;
import java.util.Map.Entry;
public class MapOverview {

	public static void main(String[] args) {
		
		Map <String, Integer> groceryMap= new LinkedHashMap<>();
		groceryMap.put("Milk", 1);
		groceryMap.put("Bread",2);
		groceryMap.put("Eggs",12);
		groceryMap.put("Coffee",2);
		groceryMap.put("Potato",2);
		groceryMap.put("Cookies",2);
		
		System.out.println(groceryMap);
		groceryMap.put("Cheese", 1);
		System.out.println(groceryMap.size());
		groceryMap.replace("Eggs", 18);
		System.out.println(groceryMap);
		groceryMap.remove("Cheese");
		System.out.println(groceryMap);
		
		//retrieving all keys+values using keySet();
		
		for (String name : groceryMap.keySet())  {
            System.out.println("key: " + name); 
		}
		
		Set<String> keySet=groceryMap.keySet();
		for (String key: keySet) {
			System.out.println("Key is "+key+" and value is "+groceryMap.get(key));
		}
		
		Iterator<String> keyIt=keySet.iterator();
		while(keyIt.hasNext()) {
			String key=keyIt.next();
			System.out.println(key+":"+groceryMap.get(key));
		}
		
		Collection<Integer> valCollection=groceryMap.values();
		for(Integer value: valCollection) {
			System.out.print(value+" ");
			
		}
		System.out.println();
		for (Integer value: groceryMap.values()) {
			System.out.print(value+" ");
			
		}
		System.out.println();
		Iterator<Integer> valueIt=groceryMap.values().iterator();
		while(valueIt.hasNext()) {
			System.out.print(valueIt.next()+" ");
		}
		//retrive all keys+values using entrySet();
		
		Set<Entry<String, Integer>>setOfEntries=groceryMap.entrySet();
		
		System.out.println();
		
		for (Map.Entry<String, Integer> entry :groceryMap.entrySet()){
			System.out.print(entry.getKey()+":"+entry.getValue()+" ");
		}
		System.out.println();
		Iterator <Map.Entry<String, Integer>> it = groceryMap.entrySet().iterator();
		while(it.hasNext()) {
		Map.Entry<String, Integer> entry=it.next();
		System.out.print(entry.getKey()+"=="+entry.getValue()+" ");
		}
	}

}
