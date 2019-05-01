package com.class27;

public abstract class ProgrammingLanguage {

	public void understandLogic() {
		System.out.println("To learn programming you must understand logic");
	}
	
	public void knowSyntax() {
		System.out.println("To learn programming you must know syntax");
	}
	
	public abstract void writeCode();
	public abstract void debug();
}



class Java extends ProgrammingLanguage{

	@Override
	public void writeCode() {
		System.out.println("To do Java programming you must use Eclipse, Netbeans or IntelliJ");
	}

	@Override
	public void debug() {
		System.out.println("In Java to debug we use Eclipse, Netbeans or IntelliJ");
	}
}

class CSharp extends ProgrammingLanguage{

	@Override
	public void writeCode() {
		System.out.println("To do C# programming you must use Visual Studio");
	}

	@Override
	public void debug() {
		System.out.println("To do debug in C# you need to use Visual Studio");
	}
}
