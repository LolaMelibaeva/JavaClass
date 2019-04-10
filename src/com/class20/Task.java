package com.class20;

public class Task {
	
	
	public static String createEmail (String name, String lastName, String emailType) {
		
		
		String email= name+lastName+"@"+emailType+".com";
		return email.toLowerCase();
	}
		public static void main(String[] args) {
			
			Task obj=new Task();
			String email=obj.createEmail("John", "Smith", "yahoo");
			System.out.println(email.toLowerCase());
			
			email=obj.createEmail("Bob", "Snow", "outlook");
			System.out.println(email);
			
		}

}
