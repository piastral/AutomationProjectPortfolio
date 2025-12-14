package justPractice.PracticeSeleniumInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorss {

	/*
	 * relative locators previously is called friendly locators from the current
	 * node or the element i can traverse in all direction using some methods which
	 * are
	 * 
	 * 1-avobe() 2-below() 3-toLeftOf() 4-toRightOf() 5-near()
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		

		 // this is relative locator for password field 
		//relative locator works if any element is not having attribute or we are not able to locate the element
		//it solves the problem via current element which has attribute 
		//so here password element didnt have any attribute so we chose username which we located and went to 
		// password field using relative locators (for that we need to establish the connection 
		//synatx of relative locator 
		//driver.findElement(RelativeLocator.with(By.tagName("input"))
			/*
			 * WebElement userName = driver.findElement(By.id("user-name")); WebElement
			 * password =
			 * driver.findElement(RelativeLocator.with(By.tagName("input")).below(userName))
			 * ; password.sendKeys("test1234"); Thread.sleep(2000);
			 */
		
		WebElement password= driver.findElement(By.id("password"));
		WebElement userName=   driver.findElement(RelativeLocator.with(By.tagName("input")).above(password));
		userName.sendKeys("mohamemd");

	}

}
