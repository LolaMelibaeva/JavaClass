package com.class07;

public class CompoundOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=100;
		b=b+100;
		System.out.println(b);//200
		
		int c=100;
		c+=100;//c=c+100;
		
		System.out.println(c);//200
		
		c+=35;//c=c+35;
		System.out.println(c); //235
		
		c+=50;//c=c+50;
		System.out.println();//285
		
		int d=30;
		d-=10;
		System.out.println(d);
		
		d+=50;
		System.out.println(d);//70
		
		d/=5; d=d/5;
		System.out.println(d);//14;
		
		
		d%=4;
		System.out.println(d);//2
		
	}

}
