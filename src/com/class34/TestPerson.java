package com.class34;
import java.util.*;
public class TestPerson {
//	In Test Class create a Map to store personId and a Person Object. Print each object details.*/
	public static void main(String[] args) {

		Map<Integer, Person> personMap=new HashMap<>();
		personMap.put(1, new Person("John", "Smith",32, 60000));
		personMap.put(2,  new Person("Dilya", "White",35, 85000));
		personMap.put(3,  new Person("Sandra","Garcia",28, 90000));
		
	//	Collection<Person> personValues= personMap.values();
	//	for(Person person: personValues) {
	//		person.printUserDetails();
	//		System.out.println("-------------------");
	//	}
		
		 for(Person person:personMap.values()) {
	            person.printUserDetails();
	            System.out.println("-------------------");
	        }
}

}
