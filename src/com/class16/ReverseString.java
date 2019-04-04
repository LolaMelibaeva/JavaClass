package com.class16;

public class ReverseString {
	String a="Syntax Technologies";
	String reverse="";
	public static void main(String[] args) {
		
		ReverseString str=new ReverseString ();
		str.reverseString();
			
		
	} void reverseString () {
		for (int i=a.length()-1; i>=0; i--) {
			reverse+=a.charAt(i);}
			System.out.println(reverse);
		}
	}

/*void reverseString() {
        String str="seigolonhceT xatnyS";
        String reverse="";
        for(int i=str.length()-1;i>=0;i--) {
            reverse=reverse+str.charAt(i);
            System.out.println(reverse);
        }
        //System.out.println(reverse);
        */
