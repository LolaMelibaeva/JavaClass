package com.Class12;

import java.util.Scanner;

public class Homework67 {
/*For you to do:
If browser is ChRoME
It should print the 
Proceed with chrome Browser
If browser is FireFOX
It should print the 
Proceed with firefox Browser
If browser is Ie
It should print the 
Proceed with ie Browser
If any other browser 
It should print the  
Invalid Browser*/

	public static void main(String[] args) {
		String browser1="Chrome";
		String browser2="Firefox";
		String browser3="Ie";
		String message;
		
		Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter the browser name to proceed further with execution");
		   String browser = sc.nextLine(); 
		   if (browser.equalsIgnoreCase(browser1)) {
			   message="Proceed with chrome Browser";
		   }else if (browser.equalsIgnoreCase(browser2)){
			   message="Proceed with firefox Browser";
			   
		   }else if (browser.equalsIgnoreCase(browser3)) {
			   message="Proceed with ie Browser";
		   }else {
			   message="Invalid Browser";
		   }System.out.println(message);
		  
		  }
		}
