package com.class27;

public class MainSuper {
	
	String parent="parent";
	double a=2.3;
	boolean isTrue=false;
	MainSuper(String str){
		System.out.println("This is parent with 1 parameter "+str);
	}
	MainSuper(String str, String str1){
		
		System.out.println("This is parent with 2 parameters "+str+" "+str1);
	}
}
class ChildSuper extends MainSuper{
	
	String parent="grandparent";
	double a=4.3;
	boolean isTrue=true;
	
	void print() {
		System.out.println(super.parent+" "+super.a+" "+super.isTrue);
		System.out.println(this.parent+" "+this.a+" "+this.isTrue);
	}
	
	ChildSuper(String str){
		super(str);
		System.out.println("this is from child with 1 parameter "+str);	}

	ChildSuper(String str, String str1) {
		super(str, str1);
		// TODO Auto-generated constructor stub
		System.out.println("this is from child with 2 paramaters "+str+" "+str1);
		
		
		}	
}
class TestChildSuper{
	public static void main(String[] args) {
		
		
		ChildSuper obj=new ChildSuper("A", "B");
		System.out.println();
		ChildSuper obj1=new ChildSuper("A");
		System.out.println();
		obj.print();
	}
}