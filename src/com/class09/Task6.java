package com.class09;
import java.util.Scanner;
public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*6. Ask a user to input a leap year. Give the user 10 chances to enter a correct leap year.
 *  As soon as the user enters the correct leap year exit the loop.
 */
		
		/*if year is evenly divisible by 400-->leap year
		 * if year is divisible by 100--> it is not a leap year
		 * if year is evenly divisible by 4--> leap year
		 */
		int year;
		Scanner scan=new Scanner (System.in);
		
			
		 for (int i=1; i<=10; i++) {
			 System.out.println("Please input a leap year");
			 year=scan.nextInt();
			if((year %400==0) || (year % 4 == 0 && year%100!=0)) {
				System.out.println("Year " + year + " is a leap year");
				break;
			}else {
				System.out.println("Year is a Not leap year");
					
			
	
}

}
}
}