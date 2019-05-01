package com.class27;

public abstract class Phone {//abstract class

	public void makeCall() {
		System.out.println("Phone can make a call");
	}
	
	public void sendText() {
		System.out.println("Phone can send text");
	}
	public abstract void unlockPhone();
	public abstract void viewPictures();
}
class iPhone extends Phone{//concrete class - is class that is inherited from a abstract
	//class or implemented by interface and providing complete implementation of all 
	//unimplemented /abstract classes
	@Override
	public void viewPictures() {
		System.out.println("To view Pictures on Iphone can go to Images ");
	}
	@Override
	public void unlockPhone() {
		System.out.println("To unlock Iphone we can use FaceId or FingerPrint");
	}
}
class Samsung extends Phone{

	@Override
	public void unlockPhone() {
		System.out.println("To unlock samsung we need to enter password");
	}
	@Override
	public void viewPictures() {
		System.out.println("To view pictures we have to go to gallery");
	}
	
}
 class PhoneTest {

	public static void main(String[] args) {
		
		//Phone obj=new Phone();ce: cannot instantiate Phone class because it is an abstract class
		Phone phone1=new iPhone();
		phone1.makeCall();
		phone1.sendText();
		phone1.unlockPhone();
		phone1.viewPictures();
		
		Phone phone2=new Samsung();
		phone2.makeCall();
		phone2.sendText();
		phone2.unlockPhone();
		phone2.viewPictures();
	}
}