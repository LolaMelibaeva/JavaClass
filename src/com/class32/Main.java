package com.class32;
import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

class Main {
  public static void main(String[] args) {
   HashSet<String> hset = new HashSet<String>();
   hset.add("first");
   hset.add("second");
   hset.add("third");
   hset.add("fourth");
   hset.add("fifth");
   
   System.out.print("HashSet contains: "+hset);
   
   String [] array=new String [hset.size()];
   hset.toArray(array);
   System.out.print("Array elements: ");
   for(String arr: array) {
	   System.out.print(arr+" ");
   }
   V compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
}
}