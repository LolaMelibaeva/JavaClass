package com.class9;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 4. Print the following pattern:
*
**
***
****
*****
****
***
**
*
 */
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1; i<=4; i++) {
			for (int y=4; y>=i; y--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
