package com.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<6; i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		for (int i=0; i<5; i++) {
			if(i==2) {
				continue;
			}
			System.out.println(i);
			
		}
		System.out.println();
		
		for (int b=1; b<=20; b++) {
			if (b%3==0) {
				continue;
			}System.out.println(b);
			
			}
		}
	}


