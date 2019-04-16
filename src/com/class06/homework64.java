package com.class06;
import java.util.Scanner;

public class homework64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    String season;
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Please enter your birthday month number");
		    int month=sc.nextInt();
		    switch (month){
		      case 1:
		        season="Winter";
		        break;
		        case 2:
		        season="Winter";
		        break;
		        case 3:
		        season="Spring";
		        break;
		        case 4:
		        season="Spring";
		        break;
		        case 5:
		        season="Spring";
		        break;
		        case 6:
		        season="Summer";
		        break;
		        case 7:
		        season="Summer";
		        break;
		        case 8:
		        season="Summer";
		        break;
		        case 9:
		        season="Fall";
		        break;
		        case 10:
		        season="Fall";
		        break;
		        case 11:
		        season="Fall";
		        break;
		        case 12:
		        season="Winter";
		        break;
		        default:
		        System.out.println("Please enter valid month number");
		        season="Unknown";
		        
		  }
		 System.out.println("You were born in " + season);   
		}
	}


