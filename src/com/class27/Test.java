package com.class27;

public class Test {

	    public static void foo(int a) {
	        System.out.println("Test.foo() called ");
	    }
	    public static void foo() { // Compiler Error: cannot redefine foo()
	        System.out.println("Test.foo(int) called ");
	    }
	    public static void main(String args[]) {
	        Test.foo();
	    }
	}



