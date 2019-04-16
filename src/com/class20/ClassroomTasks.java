package com.class20;

public class ClassroomTasks {
	public static void main(String[] args) {
		
	
	
	ClassroomTasks obj=new ClassroomTasks ();
	String reversed=obj.isReversed("Computer");
	System.out.println(reversed);
	
	ClassroomTasks objPali=new ClassroomTasks ();
	boolean pali=objPali.isPalindrome("Computer");
	System.out.println(pali);
	
	
	
	
	String [] array=obj.stringToArray("Hello everyone Students");
	for (String ar: array) {
		System.out.println(ar);
	}
	
	obj.sayHello();
}

	protected String isReversed (String word) {
		String rev="";
		for (int i=word.length()-1; i>=0; i--) {
			rev+=word.charAt(i);}
		return rev;
		}
	public boolean isPalindrome (String word) {
		
		
		
		String rev=isReversed(word);
		if (rev.equalsIgnoreCase(word)) {
			return true;
				
		}else {
			return false;
		}
	}
	
	private String[] stringToArray (String word) {
		
		String[] str=word.split(" ");
	
			
		
			return str;
		}
	void sayHello () {
		System.out.println("Hello Students");
	}
	}
	
	


