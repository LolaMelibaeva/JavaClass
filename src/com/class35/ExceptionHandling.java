package com.class35;

public class ExceptionHandling {

	public static void main(String[] args) {


			System.out.println("Beginning of the code");
			
			try {
				Thread.sleep(2000);//object of an exception might be thrown (new InterruptedException)

			}catch (InterruptedException e) {
				System.out.println("I am a catch block code");
				e.getMessage();
			}
			
			//InterruptedException e=new InterruptedException (); or
			//Exception e = new InterruptedException ();

			System.out.println("The end of the program");
	}

}
