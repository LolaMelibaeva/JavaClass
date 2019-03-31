package com.class13;

public class SplitWithCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " ,ab;gh,bc;pq#kk$bb";
		String[] str = s.split("[,;#$]");
			
		//Total how many substrings? The array length
		System.out.println("Number of substrings: "+str.length);
			
		for (int i=0; i < str.length; i++) {
			System.out.println("Str["+i+"]:"+str[i]);
		}System.out.println();
		
		int arr[] = new int [5];
		System.out.print(arr[3]);
	}

}
