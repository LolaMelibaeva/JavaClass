package com.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=65;
        int eligibleAge=16;
        int retirementAge=64;
        
        if (age<eligibleAge) {
            System.out.println("You are too young, no work for you");
        }else {
            System.out.println("You are eligible to work");
            if (age<retirementAge) {
                System.out.println("God work hard");
            }else {
                System.out.println("Please enjoy your retirement");
            }
        }
    }
}