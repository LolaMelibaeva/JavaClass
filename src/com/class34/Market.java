package com.class34;

public class Market {
	 /**
	    * 1. Create a class called Marketing with fields of employeeName, productName,
	    * and saleAmount. In your Test class have a collection of 10 marketing
	    * employees and print those who achieved more than $3000 in sales.
	    *
	    */
	    
	    private String employeeName;
	    private String productName;
	    private double saleAmount;
	    
	    
	    public Market (String employeeName, String productName, double saleAmount) {
	        super();
	        this.employeeName = employeeName;
	        this.productName = productName;
	        this.saleAmount = saleAmount;
	    }
	    public String getEmployeeName() {
	        return employeeName;
	    }
	    public void setEmployeeName(String employeeName) {
	        this.employeeName = employeeName;
	    }
	    public String getProductName() {
	        return productName;
	    }
	    public void setProductName(String productName) {
	        this.productName = productName;
	    }
	    public double getSaleAmount() {
	        return saleAmount;
	    }
	    public void setSaleAmount(double saleAmount) {
	        this.saleAmount = saleAmount;
	    }
	    @Override
	    public String toString() {
	     return "Market[employeeName=" + employeeName + ", productName="  + productName + ", saleAmount= " + saleAmount + "]";
	    }
	    
	    

	}


