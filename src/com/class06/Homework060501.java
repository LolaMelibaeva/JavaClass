package com.class06;

import java.util.Scanner;

public class Homework060501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String drink;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Are you thirsty?");
	    boolean thirsty=sc.nextBoolean();
	    System.out.println("Are you sleepy?");
	    boolean sleepy=sc.nextBoolean();
	     if((thirsty) && (!sleepy)){
	       drink="Water";}
	       else if((thirsty)&&(sleepy)){
	         drink="Coffee";
	       }else if((!thirsty)&&(sleepy)){
	           drink="Tea";
	         }else{
	           drink="Nothing";
	         }
	       
	         System.out.println("Looks like you need " + drink);
	       }
	       
	     }

