package com.Class12;

public class StringCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String 1: This is exercise 1                                                                                  
	//	String 2: This is Exercise 1
		
		String isThis="This is exercise 1";
		String isThis1="This is Exercise 1";
		
		int result=isThis.compareToIgnoreCase(isThis1);
		 if ( result< 0)
	        {
	            System.out.println("\"" + isThis + "\"" +
	                " is less than " +
	                "\"" + isThis1 + "\"");
	        }
	        else if (result == 0)
	        {
	            System.out.println("\"" + isThis + "\"" +
	                " is equal to " +
	                "\"" + isThis1 + "\"");
	        }
	        else // if (result > 0)
	        {
	            System.out.println("\"" +isThis + "\"" +
	                " is greater than " +
	                "\"" +isThis1 + "\"");
	        }
		 System.out.println("----------Concatenate Strings----------");
		 
		 /*String 1: PHP Exercises and                                                                                   
		 String 2: Python Exercises                                                                                    
		 The concatenated string: PHP Exercises and Python Exercises*/
		 
		 String lang="PHP Exercises and ";
		 String lang1="Python Exercises";
		 String lang2=lang.concat(lang1);
		 System.out.println(lang2);
		 
		 System.out.println("----------Specified Sequence Char Values-----------");
		 /*Original String: PHP Exercises and Python Exercises                                                           
Specified sequence of char values: and       */
		 
		 String val="PHP Exercises and Python Exercises";
		 boolean val1=val.contains("and");
		 System.out.println(val1);
		 System.out.println("-------------CompareTo----------");
		 String str="example.com"; String str1="example.com";                                                                   
		 String str2="Example.com";
		 boolean str4=str.equals(str1);
		 boolean str5=str.contentEquals(str2);
		 System.out.println(str4);
		 System.out.println(str5);
	}

}
