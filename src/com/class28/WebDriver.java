package com.class28;
//Create a WebDriver Interface that will have the following unimplemented behaviour
// openBrowser(), closeBrowser(), maximizeWindow(), findElement().
//Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.


public interface WebDriver {

	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
	
}
class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		// TODO Auto-generated method stub
		System.out.println("Navigate Google Chrome to have access to internet");
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		System.out.println("Press X button on top of the right side of your screen ");
	}

	@Override
	public void maximizeWindow() {
		// TODO Auto-generated method stub
		System.out.println("Press Maximize button on tope of the right side of your screen");
	}

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		System.out.println("You can click Find button on the Menu of Customize and Control Browser Bar");
		
	}
	
}
class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		// TODO Auto-generated method stub
		System.out.println("You need to download Firefox Browser");
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		System.out.println("To close Firefox (File > Exit OR Firefox button > Exit)");
	}

	@Override
	public void maximizeWindow() {
		// TODO Auto-generated method stub
		System.out.println("On the Shortcut tab, select \"Maximized\" from the Run options list");
	}

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		System.out.println("Choose Tools > Web Developer > Inspector from the Menu Bar "
				+ "or the equivalent keyboard shortcut." + 
				"Right-click an element on a web page and select Inspect Element.");
	}
	
}
class TestWebDriver {
	public static void main(String[] args) {
		WebDriver obj= new ChromeDriver();
		WebDriver obj1= new FirefoxDriver();
		
		obj.openBrowser();
		obj.closeBrowser();
		obj.maximizeWindow();
		obj.findElement();
		
		System.out.println();
		
		obj1.openBrowser();
		obj1.closeBrowser();
		obj1.maximizeWindow();
		obj1.findElement();
	}
}