package justPractice.PracticeSeleniumInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumXpath {
	public static void main(String[] args) {
	/*
	 * Absolute Xpath ==> 
	 *  starts with / single slash because it starts with root node in dom in html in real time we dont use absolute xpath 
	 *  because if any dom changes it will break the code and the element we found earlier will not work 
	 *  in absolute we dont use attribute and values 
	 *  
	 *  relative xpath --> starts from the middle  // anywhere in the middle whenever we write the locator with relative xpath 
	 *  after giving // it will reach exactly to the element if it matches 
	 *  
	 *  syntax relative xpath
	 *  //tagname[@attribute='value']
	 *  
	 * there is something called text () method we can use 
	 * syntax 
	 *  //tag[text()="value"]
	 *  --------------------------------------------------------------------------
	 *  XPATH AXES
	 *  ------------
	 *  WHEN we want to find multiple elements or descendets on that element  we use xpath axes 
	 *  1st step we want to use multi attribute 
	 *  //input[@id="user-name"][@placeholder="username"]
	 *  problem with multi attribute all should match with elementy
	 *  specific explicit tagname is specified 
	 *  we can also use * meaning it will take any tag name  *wildcard
	 *  --------------------------------------------------
	 *  XPATH WITH AND OR OPERATOR 
	 *  --------------------
	 *   //input[@id="user-name" or type="text"]  and type="text"] -->>this is the exmaple for and operator
	 *  //input[@id="user-name" or type="text"]  --> atleast one of them should work 
	 *  
	 *  ------------------------------------------------------------------
	 *   Xpath with inner text -- text()
	 *   // tag[text()="value"]--> text() is method 
	 *  ----------------------------------------
	 *  Xpath with CONTAINS () METHOD
	 *  -------------------------------------
	 *  //input[@id="user-name"]
	 *  maybe id is changing everytime whenever the page is reloading some value gets changed so we cannot 
	 *  write like that 
	 *  
	 *  in order to solve this we use contains method
	 *  //input[contains(@attribute,'partial value')]
	 *  ----------------------------------------------------
	 *  XPATH WITH STARTS-WITH() METHOD
	 *  //tagname[starts-with(@attribute,'value')] ---> just starts with starting any value 
	 * -----------------------------------------------------------   
	 * CHAINED XPATH 
	 * lets say we are not able to find the locator for element in that casse we can chain the xpath 
	 * and locate for that we need to take parent after that single slash followed by child 
	 * 
	 * comination of relative and absolute xpath 
	 * //div[@class="login-box"]/form/div  
	 * //div[@class="login-box"]-----> parent and lets say we need to to form and click 
	 * for that we will use single slash 
	 * //div[@class="login-box"]/form/div[1] we can also pass the number 
	 *  
	 *  
	 *  wildcard we can also use (*) star is wildcard it will take any tagname
	 *  //*[@id="user-name"] // there is one problem using wildcard if two or more elements holds
	 *  same attribute and its value it will be problem thats why explicitly we should always follow
	 *  the standard of using tagname
	 *  chained x path is combination of absolute xpath and relative xpath 
	 *  here we traverse thru the element to find the unique element it depennd upon the requirement 
	 * 
	 * 	we can also use textmethod and contains,and starts-with method together to find uinique locator 
	 * for our element
	 */
		

		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		  driver.manage().window().maximize();
		  
		  //username
			/*
			 * WebElement userName=
			 * driver.findElement(By.cssSelector("input.input_error[placeholder=Username]"))
			 * ; userName.sendKeys("standard_user"); //password WebElement passWord=
			 * driver.findElement(By.cssSelector("input#password"));
			 * passWord.sendKeys("secret_sauce"); //login WebElement login=
			 * driver.findElement(By.cssSelector("input.submit-button[value='Login']"));
			 * login.click();
			 * 
			 * WebElement productPage= driver.findElement(By.cssSelector("span.title"));
			 * String text= productPage.getText(); System.out.println(text);
			 */
		  
		   
		
	}
 
}
