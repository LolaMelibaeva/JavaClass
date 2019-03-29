package com.class5;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*sales is <100==> commission=2
 * sales more than 100 less 200 commission =5
 * 
 * 
 */
			int commission;
			Scanner sc=new Scanner(System.in);
			System.out.println("Please, enter sales amount");
			int sales=sc.nextInt();
			
			if (sales>0 && sales<100) {
			 commission =2;
			}else if (sales>=100 && sales<200) {
				commission=5;
			}else if (sales>=200 && sales<500) {
			 commission=10;
			}else if (sales>=500) {
				commission=20;
			}else {
				commission=0;
			}
			System.out.println("Your commision is " + commission);

}
}

