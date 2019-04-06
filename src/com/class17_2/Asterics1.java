package com.class17_2;

public class Asterics1 {
	public static void main(String[] args) {
		
		Asterics1 pyramid=new Asterics1();
		pyramid.isPyramid();
	
	
	
	}
	void isPyramid () {
		for (int a=0; a<5; a++) {
			for (int b=0; b<a; b++) {
				System.out.print("*");
			}
			System.out.println();
	
	}
}

}