package com.class27;
/*I want you to create two classes one called MainInherintence and ChildInherintence
*
* in your main class i want you to create 1 method to swap numbers, and another to swap strings
*
* and in your child i want you to extend main, and i want you to create the same methods, and parameters,
*  but in the block of code
* i want you to print "not reversing" for swap numbers, and print 2 "not reversing" swap String*/


public class MainInheritance {
	
	public void swapNumbers (int a, int b) {
		
		a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		System.out.println("The new value of a= "+a);
		System.out.println("The new value of b= "+b);
	}	
	public void swapString (String a, String b) {
	
		a=a+b;//ShabanHaqqa
		b=a.substring(0, a.length()-b.length());//0,shaban
		a=a.substring(b.length());
		System.out.println("The new String a is "+a);
		System.out.println("The new String b is "+b);
		
	}
}
class ChildInheritance extends MainInheritance{
	
//-----above is from child-------------
    void parentNumbers(int a, int b) {
        super.swapNumbers(a, b);
    }

    void parentString(String a, String b) {
        super.swapString(a, b);
    }

    public static void main(String[] args) {
        ChildInheritance child=new ChildInheritance();
        child.parentNumbers(5, 6);
        child.parentString("Shaban", "Haqqa");
    }

}

