package com.class17_2;

public class Main2 {
	
		 public static char getChar(String word, int index) {
		char ch=word.charAt(index);
		 return ch;
		 
			}
			
			//test case below (dont change):
			public static void main(String[] args){
				System.out.println(getChar("hello",1)); //should be 'e'
			}
		}