package com.class34;
import java.util.*;

public class TestMarketing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Map<Integer, Marketing> markMap=new LinkedHashMap<>();
		markMap.put(1, new Marketing("John Smith", "Cars", 20000));
		markMap.put(2,  new Marketing("Anna Smith", "Autoparts", 2000));
		markMap.put(3,  new Marketing("Kate Levy", "Car furniture", 12500));
		markMap.put(4,  new Marketing("Tom Cruise", "Car paints", 1500));
		markMap.put(5,  new Marketing("Gisele Garcia", "Accessories", 3500));
		markMap.put(6,  new Marketing("Sandra Ferrari", "Car insurance", 3500));
		markMap.put(7,  new Marketing("Adam Gold", "Car engine", 25000));
		markMap.put(8,  new Marketing("Jason Huggins", "Apps", 25000));
		markMap.put(9,  new Marketing("Lary King", "GPS", 1000));
		markMap.put(10,  new Marketing("Kim Jones", "Car battery", 50000));
		
		Collection<Marketing> markValues=markMap.values();
		for(Marketing obj: markValues) {
			obj.printSales();
			}
	}
}
