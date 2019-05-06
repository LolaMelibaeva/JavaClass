package com.class31;

import java.util.*;
public class Exercise8 {
public static void main(String[] args) {
// Creae a list and add some colors to the list
List<String> list_Strings = new ArrayList<String>();
list_Strings.add("Red");
list_Strings.add("Green");
list_Strings.add("Orange");
list_Strings.add("White");
list_Strings.add("Black");
System.out.println("List before sort: "+list_Strings);
Collections.sort(list_Strings);
System.out.println("List after sort: "+list_Strings);    


// Creae a list and add some colors to the list
List<String> list_Strings1 = new ArrayList<String>();
list_Strings1.add("Red");
list_Strings1.add("Green");
list_Strings1.add("Orange");
list_Strings1.add("White");
list_Strings1.add("Black");
System.out.println("List before reversing :\n" + list_Strings1);  
Collections.reverse(list_Strings1);
System.out.println("List after reversing :\n" + list_Strings1); 


ArrayList<String> c1= new ArrayList<String>();
c1.add("Red");
c1.add("Green");
c1.add("Black");
c1.add("White");
c1.add("Pink");
System.out.println("Original array list: " + c1);
System.out.println("Let trim to size the above array: ");
c1.trimToSize();
System.out.println(c1);

ArrayList<String>  color = new ArrayList<String>();

color.add("Red");
color.add("Green");

System.out.println("Original array list: " + color);
String new_color = "White";
color.set(1,new_color);

int num=color.size();
System.out.println("Replace second element with 'White'."); 
for(int i=0;i<num;i++)
System.out.println(color.get(i));
}


}
