package com.class23_2;
import com.class23.*;
public class WaterFallTeam extends Employee{
	
	public static void main(String[] args) {
		WaterFallTeam wt=new WaterFallTeam ();
		wt.salary1=90000;// can access to protected value from different package through inheritance.
		//wt.salary can not be accessed because it is default value.
		wt.test();//available cause it is protected
	//	wt.test1();//NOT available b/c it is default method
		
		
	}

}
