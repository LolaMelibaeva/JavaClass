package com.class7;

public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=1;
		x=x+1;
		
		System.out.println(x);
		int y=1;
		y+=1;
		System.out.println(y);
		
		int z=1;
		z++;
		System.out.println(z);
		
		int w=2;
		w++;
		System.out.println(w);
		
		int v=10;
		v--;
		System.out.println(v);
		
		int a=10;
		int b=++a;//preinrement=first cincrement-->assign
				
		int c=10;		
		int d=c++;//postincrement=first assign-->increment
		System.out.println(b);
		System.out.println(a);
		System.out.println(d);
		System.out.println(c);
		
		int q=100;
		int e=q--;
		System.out.println(e);
		System.out.println(q);
		
		int h=50;
		int g=--h;
		System.out.println(g);
		System.out.println(h);
				
				
	}

}
