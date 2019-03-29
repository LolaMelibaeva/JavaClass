package com.Class12;
import java.util.Scanner;
import java.lang.*;
public class Task1 {

	public static void main(String[] args) {
		/*Accept username, password and confirm password and check following requirements:

Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message “Passwords do not match”.
Only after all requirements met → message “Your username and password has been created”*/
		
		
		String uname="username";
		String pass="password";
		String confpass="password1";
		Scanner input=new Scanner (System.in);
		System.out.println("Please, enter a username");
		uname=input.nextLine();
		System.out.println("Please, enter a password");
		pass=input.nextLine();
		System.out.println("Please, confirm an entered password");
		confpass=input.nextLine();
		if ((uname.isEmpty() || pass.isEmpty())) {
			System.out.println("Username and Password can not be empty");
		    if(pass.length()<=8) {
		    	System.out.println("Password is too short");
					if (uname.equals(pass)) {
						System.out.println("Password can not contain username");
						if (!pass.equals(confpass)) {
							System.out.println("Passwords do not match");		}
				
					
						
							System.out.println("Your username and password has been created");
						}
					
		}
		
		    }
		}
	}



