package com.class17_2;

public class Asterics2 {

	public static void main(String[] args) {
		
		Asterics2 sqre=new Asterics2();
			sqre.squareOutlined();
		
			

}
	void squareOutlined () {
		for (int i=1; i<=4; i++) {
			for (int j=1; j<=5; j++) {
				if (i==1 || i==4 || j==1 || j==5) {
				
				System.out.print("*");
			}else {
				System.out.print(" ");
		}

	}
			System.out.println();
}
}}