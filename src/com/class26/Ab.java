package com.class26;

class Ab {

		   // Make constructor private to prevent object creation
		   //From outside of this class.
		    private Ab() { 
		    }    
			
			//Static method to create and return an object.
			//this method will be called from outside by using
			//class name only.
		    public static Ab GetInstance() {
		        return new Ab();
		    }
		}

