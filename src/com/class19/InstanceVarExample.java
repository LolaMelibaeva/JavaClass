package com.class19;

public class InstanceVarExample {
	 String myInstanceVar="instance variable"; 
	 public static void main(String args[]){
		 InstanceVarExample obj = new InstanceVarExample();
		 InstanceVarExample obj2 = new InstanceVarExample();
		 
		 System.out.println(obj.myInstanceVar);
		 System.out.println(obj2.myInstanceVar);
		 
		 obj2.myInstanceVar = "Changed Text";
		 
		 System.out.println(obj.myInstanceVar);
		 System.out.println(obj2.myInstanceVar); 
		 
		 obj.myInstanceVar="Changed Test again";
		 System.out.println(obj.myInstanceVar);
		 System.out.println(obj2.myInstanceVar);
		 }}
