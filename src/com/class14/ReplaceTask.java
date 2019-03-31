package com.class14;

public class ReplaceTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "1L2o3l4@@a^##%";
		
		String st = str.replaceAll("[^A-Za-z]", "");
		
		System.out.println(st+" has "+st.length()+" characters.");		
	
	}

}
