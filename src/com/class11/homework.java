package com.class11;



public class homework {

	public static void main(String[] args) {
		

	/*	int[][] a = {
			{1,1,1,1},
			{1,1,1,1},
			{1,1,1,1}
		 
		};
		 boolean isSquare=true;
		 for(int row = 0; row < a.length; row++){
		 for(int col = 0; col < a[row].length; col++){
		     if(a.length!= a[row].length){
		         isSquare = false;
		        
		 }
	}
		} System.out.println(isSquare);
	}
}
			
		 
		 
		 /* for (int i=0; i<a.length; i++) {
			 for (int y=0; y<a[i].length; y++) {
			   if(a[i]==a[y]) {

			   }

			 }
			
		 }System.out.println("true"); */
		
		/*String Str = new String("Welcome on Board"); 
		String SubStr1 = new String("Tutorials");
		String SubStr2 = new String("Sutorials");
		System.out.print("Found Index :" ); 
		System.out.println(Str.indexOf( 'o' ))
		;System.out.print("Found Index :" );
		System.out.println( Str.indexOf("B" ));
		System.out.print("Found Index :" );
		System.out.println(Str.indexOf( SubStr2 )); */
		
		/*Original String = Java Exercises!                                                                             
The character at position 0 is J                                                                              
The character at position 10 is i */
		
		String str="Java Exercises!";
		char index=str.charAt(0);
		char index1=str.charAt(10);
				System.out.println("The character at index 0 is " +index);
				System.out.println("The character at index 10 is "+ index1);
		System.out.println("--------Printing Unicod___________");
		
		//Original String : w3resource.com 
		
		String str1="w3resource.com ";
		int val=str1.codePointAt(1);int val2=str1.codePointBefore(1); int val3=str1.codePointAt(0);
		int val1=str1.charAt(9); int val4=str1.codePointCount(1,10);
		System.out.println("Unicode value of index 1 is: " + val);
		System.out.println("Unicode value of index 1 is: "+ val1);
		System.out.println("Unicode value of index 1 is: "+ val2);
		System.out.println("Unicode value of index 1 is: "+ val3);
		System.out.println("Unicode value of index 1 is: "+ val4);
		System.out.println("------Compare 2 Strings Lexicographically------");
		
		String isThis="This is Exercise 1";                                                                                  
		String isThis1="This is Exercise 2";
		int result=isThis.compareTo(isThis1);
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
		
		System.out.println("------Comparing Two Strings-----------");
	}
}
