package com.class16;

public class Dog {
		//Create a Dog Class and create 3 different objects of it: 
		//Husky, Bulldog, Labrador  with specific  attributes and behaviors.
		String breed, size, color;
		boolean furry, longtail;
		
		public static void main(String[] args) {
		
			Dog dog1= new Dog ();
			dog1.breed="Husky";
			dog1.size="Big";
			dog1.color="Grey and White";
			dog1.furry=true;
			dog1.longtail=true;
			System.out.println("-----------Dog #1: "+dog1.breed+" is a " +dog1.size+" size dog "+"-------------");
			dog1.bark();
			dog1.run();
			dog1.jump();
			System.out.println();
			
			Dog dog2= new Dog ();
			dog2.breed="Bulldog";
			dog2.size="Medium";
			dog2.color="Brown and White";
			dog2.furry=false;
			dog2.longtail=false;
			System.out.println("-----------Dog #2: "+dog2.breed+" is a " +dog2.size+" size dog "+"-------------");
			dog2.bark();
			dog2.run();
			dog2.jump();
			System.out.println();
			

			Dog dog3= new Dog ();
			dog3.breed="Labrador";
			dog3.size="Big";
			dog3.color="Black";
			dog3.furry=false;
			dog3.longtail=true;
			System.out.println("-----------Dog #3: "+dog3.breed+" is a " +dog3.size+" size dog "+"-------------");
			dog3.bark();
			dog3.run();
			dog3.jump();
			System.out.println();
			
			
			
		
		
		}
void bark() {
	System.out.println(breed +" can bark loud");
	}
void run () {
	System.out.println(breed + " can run fast");
	
}
void jump (){
	System.out.println(breed + " can jump high");
}

}