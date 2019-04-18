package inheritance;

public class Childs extends Parent{
	
	
	Childs (){
	//	System.out.println("I am a Child constructor from Child Class");
	}
	public static void main(String[] args) {
		
		Childs obj2=new Childs ();
		Childs obj=new Childs ();
		Childs obj1=new Childs ();
		
		System.out.println(obj.isReverse("Hello"));
		
		System.out.println(obj.isReverse("one", "two"));
		
		
	}
}