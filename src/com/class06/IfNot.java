package com.class06;

import java.util.Scanner;

public class IfNot {
		public static void main(String[] args) {
			
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter three numbers.");
        int num1 = sc.nextInt();
        int num2= sc.nextInt();
        int num3=sc.nextInt();
        int largest;
        if(!(num1==num2 && num2==num3 && num2==num3)) {//if numbers are NOT equal
        if (num1>num2) {
            if (num1>num3) {
                largest=num1;
            }else {
                largest=num3;
            }
}else { //assuming num2>num1
    
            if (num2>num3) {
                largest=num2;
            }else {
                largest=num3;
            }
}
        
        
        System.out.println("The largest number is "+largest);
    

				
			}
		}	
		
}
	
	
	


