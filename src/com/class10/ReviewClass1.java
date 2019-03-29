package com.class10;

public class ReviewClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*awet(Instructor) [7:13 PM]
* Write a program that prints the following pattern
					1 2 3 4 5 6 7 8 9 10
                    2 4 6 8 10 12 14 16 18 20
                    3 6 9 12 15 18 21 24 27 30
                    4 8 12 16 20 24 28 32 36 40
                    5 10 15 20 25 30 35 40 45 50*/
		
		for (int i=1; i<=10; i++) {
			for (int y=i; y<=(10*i); y+=i) {
		
	System.out.print(y+" ");
			}
			System.out.println();
}
		
	}
}