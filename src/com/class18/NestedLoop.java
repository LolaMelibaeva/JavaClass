package com.class18;

public class NestedLoop {

	public static void main(String[] args) {
		NestedLoop loop=new NestedLoop();
		loop.runPattern();

			
		}
		
		void runPattern () {

			for (int i=0; i<5; i++) {
				
				for (int y=0; y<3; y++) {
					System.out.println("I am inner loop"+y);
				}
				System.out.println("-----I am outer loop-----"+i);
		}

}
}