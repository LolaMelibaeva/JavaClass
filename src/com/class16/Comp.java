package com.class16;

public class Comp {

	
	 String OS, brand;
	 boolean mouse, keyboard;
	 int screen, ram;
	 
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Comp com=new Comp();
			com.mouse = true;
			com.keyboard=true;
			com.screen=2;
			com.ram=8;
			com.OS="Windows";
			com.brand="HP";
			System.out.println("Object 1: Windows computer");
			com.watchMovie();
			com.doJavaCoding();
			com.playMusic();
			
			System.out.println("-----------------------------------");
			Comp com1=new Comp();
			com1.mouse=false;
			com1.keyboard=false;
			com1.screen=2;
			com1.ram=6;
			com1.OS="Mac OS";
			com1.brand="Apple";
			System.out.println("Object 2: Mac OS computer");
			com1.watchMovie();
			com1.doJavaCoding();
			com1.playMusic();
			
	 } 
 void watchMovie() {
	 System.out.println("We can watch movies on a computer "+OS);
 }
 void doJavaCoding() {
	 System.out.println("We can do Java coding on our computer "+brand);
 }
	 
 void playMusic() {
	 System.out.println("We can play music on a computer "+brand);
 }
	
	}


