package com.class20;

public class TestAccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassroomTasks obj=new ClassroomTasks();
		obj.isPalindrome("madam"); //accessing public method;
		obj.isReversed("hello"); //accessing protected method;
		obj.sayHello();//accessing default method;
		//obj.getWordsFromString("Hello Students"); private method is not accessible;
		
	}

}
