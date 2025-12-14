package myPraciceCodingSeleniumAll;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

interface SearchContext2 { //parent

	WebElement1 findElement1(); // abstarct method findElement1 unImplemented //interface inside interface

}
//i am chaining the interface 

interface WebElement1 extends SearchContext2 {
	@Override
	WebElement1 findElement1(); // is extending from searchContext2

	void click1(); /// internatl method of webelement

	void sendKeys1();

	boolean isEnabled1();
	void clear();
}

interface WebDriver1 extends SearchContext2{
	
	WebElement1 findElement1();
}

class RemoteWebDriver1 implements WebDriver1,WebElement1 {

	@Override
	public WebElement1 findElement1() {
		return findElement1();
	}

	@Override
	public void click1() {
	System.out.println("hello");
	}

	@Override
	public void sendKeys1() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEnabled1() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

}

class ChromeDriver1 extends RemoteWebDriver1{
	public static void main(String[] args) {
		WebDriver1 driver = new ChromeDriver1() ; // loosely coupled 
		
 WebElement1 element =   driver.findElement1();

	
}
}
