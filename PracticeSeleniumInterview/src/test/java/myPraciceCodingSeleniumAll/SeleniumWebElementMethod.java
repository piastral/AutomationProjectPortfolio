package myPraciceCodingSeleniumAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElementMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		By locator = By.xpath("//input[@id='name']");
		WebElement ele = locator.findElement(driver);
		ele.click();
	String ariaRole=	ele.getTagName();
	System.out.println(ariaRole); 
	driver.quit();
		
		//lets try aria role
// 1) aria role help us to define or to identify the element's role like if element is radio or checkbox 
//)2 getAccesiblename;	// it will identify that element is which type or get the name of that element 
//3)getDomAttribute 
//4) e.getTagName = we can also find the element belongs to which tag and tag is located with some name	
		
		
		/*
		 * ele.clear(); ele.click(); ele.getAccessibleName(); ele.getAriaRole();
		 * ; ele.getCssValue(null); ele.getDomAttribute(null);
		 * ele.getDomProperty(null); ele.getTagName(); ele.getText(); ele.isDisplayed();
		 * ele.isEnabled(); ele.isSelected(); ele.sendKeys(args);
		 */
		
		

	}
	/*
	 * =============================START WEB ELEMENT METHODS INTERFACE
	 * =========================================
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
