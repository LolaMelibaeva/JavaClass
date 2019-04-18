package inheritance;

public class Boolean {

	
	static boolean isBoolean (boolean a, boolean b) {
		boolean c=false;
		if(a==true && b==true) {
			c=false;
		}else if(a==false && b==false){
			c=true;
		}else if (a==true && b==false) {
			c=false;
		
		}else if (a==false && a==false) {
			c=true;
		}
		
		return c;
	}
	public static void main(String[] args) {
		
		System.out.println(isBoolean(true,true));
		
	}
}
