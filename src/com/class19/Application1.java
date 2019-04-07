package com.class19;

public class Application1 {

	public static void main(String[] args) {
		
		Calculator calc=new Calculator ();
		int sum=calc.sum(12,13,14);
		System.out.println(sum);
		int ave=calc.ave(12, 13, 14);
		System.out.println(ave);
		int min=calc.min(12, 13, 14);
		System.out.println(min);
		int max=calc.max(12, 13, 14);
		System.out.println(max);
	}

}
