package com.class34;

/*1. Create a class called Marketing with fields of employeeName, productName,
    * and saleAmount. In your Test class have a collection of 10 marketing
    * employees and print those who achieved more than $3000 in sales.
    *
    */
public class Marketing {
	
	String employeeName, productName;
	int saleAmount;
	
	Marketing(String employeeName, String productName, int saleAmount){
		this.employeeName=employeeName;
		this.productName=productName;
		this.saleAmount=saleAmount;
	}
	public void printSales() {
		if (saleAmount>3000) {	
		System.out.println("Employee name is: "+employeeName+" Product Name is : "+productName+" Sale Amount is :"+saleAmount);
	}else {
		System.out.println(employeeName +" you need to achieve $3000 in sales to get a bonus");
	}
	}
}
