package com.class35;

public class ChildToParentException {

	public static void main(String[] args) {
		
		int[] array = {17,99,8};
		try {
			Thread.sleep(2000);
		System.out.println(array[3]);
		}catch( InterruptedException e) {
			
		}catch (ArithmeticException e) {
			
		}catch( Exception e) {
		System.out.println("Code after an exception");
				
	}

}
}