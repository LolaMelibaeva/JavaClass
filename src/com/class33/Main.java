package com.class33;
import java.util.*;
class Main {
  public static void main(String [] args){
    Map<Integer,Double> map=new HashMap<Integer,Double>();
    map.put(1, 1.1);
    map.put(2, 2.2);
    map.put(3, 3.3);
    map.put(4, 4.4);
    map.put(5, 5.5);
    
		  System.out.println(map.containsKey(3));
		  System.out.println(map.containsValue(4.4));
		  System.out.println(map.containsKey(6));
    
		}

}