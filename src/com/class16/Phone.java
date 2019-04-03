package com.class16;

public class Phone {
	//Create a Class “Phone”. Create 3 Objects of it: iPhone, Android,
	//Nokia with specific  attributes and behaviors.
	String model, make, color, OS;
	int RAM, camera;
	boolean bluetooth;
	public static void main(String[] args) {
		
	
	Phone phon=new Phone();
	phon.model="IPhone8";
	phon.make="Apple";
	phon.color="White";
	phon.OS="iOS";
	phon.RAM=2;
	phon.camera=2;
	phon.bluetooth=true;
	System.out.println("----------------Phone #1: "+phon.model+" by "+phon.make+"----------------");
	 phon.callPhone();
	 phon.txtMessages();
	 phon.audioVideo();
	 System.out.println();
	 
	 Phone phon1=new Phone();
	 phon1.model="Galaxy Fold";
	 phon1.make="Samsung";
	 phon1.color="Space Silver";
	 phon1.OS="Android";
	 phon1.RAM=12;
	 phon1.camera=3;
	 phon1.bluetooth=false;
	 System.out.println("----------------Phone #2: "+phon1.model+" by "+phon1.make+"----------------");
	 phon.callPhone();
	 phon.txtMessages();
	 phon.audioVideo();
	 System.out.println();
	 
	 Phone phon2=new Phone();
	 phon2.model="Nokia 10";
	 phon2.make="Nokia";
	 phon2.color="Black";
	 phon2.OS="Android";
	 phon2.RAM=6;
	 phon1.camera=2;
	 phon1.bluetooth=true;
	 System.out.println("----------------Phone #3: "+phon2.model+" by "+phon2.make+"----------------");
	 phon.callPhone();
	 phon.txtMessages();
	 phon.audioVideo();
	 System.out.println();
	 
	
	}
	void callPhone() {
		System.out.println("You can call other phone numbers");
	}
	void txtMessages() {
		System.out.println("You can text message");
	}
	void audioVideo() {
		System.out.println("You can audio/video chat");
	}

}