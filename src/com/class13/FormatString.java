package com.class13;

public class FormatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1 = "cool string";
		String str2 = "88";
		int str=88;
		
		String fstr=String.format("My formated %1$s, %1$s and %2$s.", str1, str2);
		System.out.println(fstr);
		
		String fstr1=String.format("%01d", str);
		System.out.println(fstr1);
		System.out.println("------------------Split-----------------");
		
		String str5 = new String("28/12/2013");
	       
		System.out.println("split(String regex):");
		
		String array1[]= str5.split("/");
		for (String temp: array1){
		      System.out.println(temp);
		}
		System.out.println("split(String regex, int limit) with limit=2:");
		String array2[]= str5.split("/", 2);
		for (String temp: array2){
		      System.out.println(temp);
		      
		}
		System.out.println("split(String regex, int limit) with limit=0:");
		String array3[]= str5.split("/", 0);
		for (String temp: array3){
		      System.out.println(temp);
		}
		
		       
		/* When we pass limit as negative. The split method works same as the first variation
		 * because negative limit says that the method returns substrings with no limit.
		 */
		System.out.println("split(String regex, int limit) with limit=-5:");
		String array4[]= str5.split("/", -5);
		for (String temp: array4){
		      System.out.println(temp);
		}
	}

}
