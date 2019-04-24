package com.class26;

public interface Abc {
	
		int addNumbers(int a[]);
	}

	//Implement interface A and implement the interface method
	class Test implements Abc {

		public static void main(String... args) {
			Abc test = new Test();
			System.out.println("Total of numbers in passed array is:"
					+ test.addNumbers(new int[] { 1, 2, 3 }));
		}

		public int addNumbers(int[] a) {
			int total = 0;
			for (int i = 0; i < a.length; i++) {
				total += a[i];
			}
			return total;
		}
	}

