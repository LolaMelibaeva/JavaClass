package com.class23_2;

class Main {
	 static int count=0;
	  
	  public void m(){
		 
	    System.out.println(count);
	  
	  }
	  public static void main(String[] args) {
	    
	    Main obj=new Main();
	    count++;
	    Main obj1=new Main();
	    count++;
	    Main obj2=new Main();     
	    count++;
	    
	    obj.m();
	    obj1.m();
	    obj2.m();
	    
	    
	   
	   
	  }
	}