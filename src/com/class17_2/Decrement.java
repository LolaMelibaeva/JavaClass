package com.class17_2;

public class Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*I want to print pattern
		 * 54321
		 * 54321
		 * 54321
		 * 54321
		 */
		
		for (int i=1; i<=5; i++) {
			for (int j=5; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
