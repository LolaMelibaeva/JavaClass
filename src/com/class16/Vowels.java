package com.class16;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowels vowel=new Vowels();
		vowel.showVowels();
		
	} void showVowels () {
		String str="hello world my name Is wEqas";
		char[] str1=str.toCharArray();
		  int count=0;
		for(int i = 0; i < str.length(); i++) {
			
			 if(str1[i] == 'a'|| str1[i] == 'e'||str1[i] == 'i' || str1[i] == 'o'
					 ||str1[i] == 'u'||str1[i]== 'E' || str1[i]=='I'){
		          
					count++;
		}
	}System.out.println(count);

	}
}
