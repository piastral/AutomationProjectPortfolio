package myPraciceCodingSeleniumAll;

public interface SearchContext1 {
	
WebElement1	findElement1();
}

interface WebElement1	 extends SearchContext1{
void  click1();
	 void sendKeys();
	
	
	@Override
	WebElement1	findElement1();
	
}

interface WebDriver1 extends SearchContext1 ,WebElement1{
	
	WebElement1 findElement1() ;
	void run();
		
}

class Chromedriver1 implements WebDriver1{


	

	@Override
	public WebElement1 findElement1() {
		
		return findElement1();
	}

	@Override
	public void click1() {
	String abc ="bala";
	String bbc ="hola";
 

		
	
		
	}

	@Override
	public void sendKeys() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		String abc ="bala";
		String bbc ="hola";
	  String ttt =abc+bbc;
	 
	}
	
	
}
 class mama  {
	 public static void main(String[] args) {
		WebDriver1 driver = new Chromedriver1();
		driver.findElement1();
	}
 }



