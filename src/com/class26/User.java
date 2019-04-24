package com.class26;

public class User {
		String name, phoneNumber;
	User (String name, String phoneNumber){
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
}
class UserInfo extends User {
		String address;
		UserInfo (String name, String phoneNumber, String address){
			super(name, phoneNumber);
			this.address=address;
		}
		
	

	

	public void userDetails () {
		System.out.println(name+"\n"+"Address: "+address+"\n"+"telephone: "+phoneNumber);
	}
	
}

class TestUser{
	public static void main(String[] args) {
		
		UserInfo obj=new UserInfo("John Smith", "202 456 1569","71 Main Street, Vienna, VA");
		obj.userDetails();
	}
}