package com.class16;

public class ReviewWeqasDay1 {
	public static void main(String[] args) {
		
	
	ReviewWeqasDay1 weqas=new ReviewWeqasDay1();
	
		
		weqas.vowelCountWithLoop();
		weqas.vowelCountWithReplaceAll();
		
		 ReviewWeqasDay1 weqas1=new  ReviewWeqasDay1();
	        weqas1.vowelPrint();
	}         
		
	
		
	void vowelCountWithLoop() {
        String weqas="hello world my name Is wEqas";
        
        char[] w=weqas.toCharArray();
        char empty;
        for(int i=0;i<=w.length-1;i++) {
            if(w[i]=='a'||w[i]=='A'||w[i]=='e'||w[i]=='E'||w[i]=='i'
                    || w[i]=='I'||w[i]=='o'||w[i]=='O'||w[i]=='u'||w[i]=='U') {
                empty=w[i];
                System.out.print(empty+",");
            }
        }
            }
        void vowelPrint (){
            	
            	String weqas1="Syntax Technology";
            	
            	char [] arr=weqas1.toCharArray();
            	for (int i=0; i<arr.length;i++ ) {
            		if (arr[i]=='a'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='e'){
            			System.out.print(arr[i]+" ");
            		}
            	}
            	}
  
        
        
        
    
    
    
    void vowelCountWithReplaceAll() {
        String weqas="hello world my name Is wEqas";
        String replace =weqas.replaceAll("[^aA,eE,iI,oO,uU]", "");
        //String replace =string.replaceAll("[^aA,eE,iI,oO,uU]", "");

        System.out.println(replace);
    }

}
