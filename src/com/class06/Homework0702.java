package com.class06;
import java.util.Scanner;
public class Homework0702 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String activity;
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enter the age of the Child");
		    int age=sc.nextInt();
		    switch(age){
		      case 1:
		        activity="You can Crawl";
		        break;
		        case 2:
		        activity="You can Talk";
		        break;
		        case 3:
		          activity="You can Dance";
		          break;
		          case 4:
		            activity="You can get Trouble";
		            default:
		            activity="I don't know how old you are";
		    }
		    System.out.println(activity);
		  }
		}
	


