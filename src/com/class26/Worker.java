package com.class26;

public class Worker {
	
	Worker (){
		this("hi");
		System.out.println("I am a constructor without a parameter");
	}
	Worker (String str){
		System.out.println("I am a constructor with one parameter");
	}
}
class TestWorker{
	public static void main(String[] args) {
		
		
		Worker obr=new Worker();
	}
}