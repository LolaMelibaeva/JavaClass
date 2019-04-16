package com.class06;
import java.util.Scanner;
public class Homework0705 {

	public static void main (String[] args) {
		  String carOrigin;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Please enter your favorite car make");
		  String car=sc.nextLine();
		  switch(car){
		    case"BMW":
		      carOrigin="german car";
		      break;
		      case"Toyota":
		      carOrigin="japanese car";
		      break;
		      case"Maserati":
		      carOrigin="italian car";
		      break;
		      default:
		      carOrigin="unknown";
		    }
		  System.out.println("Your favorite car is " + carOrigin);
		}
		}