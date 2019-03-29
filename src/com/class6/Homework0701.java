package com.class6;
import java.util.Scanner; 
public class Homework0701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		   String responsilibity;
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter name of the instructor");
		   String instructor=sc.nextLine();
		   switch(instructor){
		   case "Shiva":
		     responsilibity="Will take care of Java Assignment";
		     break;
		     case "Sandish":
		       responsilibity="Will take care of SDLC Assignment";
		       break;
		       case "Weqas":
		         responsilibity="Will take care of Selenium Assignment";
		         break;
		         case "Asel":
		           responsilibity="Will take care of every Assignment";
		           break;
		           default:
		           responsilibity="Invalid instructor selected";
		           
		}
		   System.out.println(instructor + " "+ responsilibity);
	}

}
