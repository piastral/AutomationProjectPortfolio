package justPractice.PracticeSeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	/*
	 * mouse hover will be helful when we want to perfrom with the help of mouse 1-
	 * mouse -hover 2- right click 3- double click 4- drag and drop
	 * 
	 * with the help of action class object we can use action keyword and perform
	 * the required the mouse action scenARIOS where we wll do mouse hover lets say
	 * we o to myntra ,com and then we hover on men section with mouse and the
	 * following categories will be displayed this is example of mouse hover
	 * 
	 * 1- we have to go to mynta ,com 2- we will use moveToElement which will help
	 * in locating
	 * ===============================================================
	 * 1- with right click we can do CONTEXTCLICK)(
	 * 2-- CONTEXT MENU
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
	
		
		 
			/*
			 * WebElement men = driver.findElement(By.xpath(
			 * "//div[@class='desktop-navContent']//a[text()='Men']")); WebElement tShirts =
			 * driver.findElement(By.xpath(
			 * "//div[@class='desktop-paneContent']//div//li//ul//a[@href=\"/men-tshirts\"]"
			 * ));
			 * 
			 * 
			 * action.moveToElement(men).build().perform(); tShirts.click();
			 */
		// for right CLICK WE HAVE TO USE CONTEXT CLICK()
		//1st right click //2nd copy 
		//over here we are using context click and then using action class with build & perform 
		// after that we are finding the locator for copy button and then we are clicking on copy and then we handle popup
		

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		   
	             By rightClickLocator =	 By.xpath("//div[@class='wy-nav-content']//div//span[text()='right click me']");
	                    WebElement rightClickButton  = driver.findElement(rightClickLocator);
	         
	                    //Performing the right click
	           Actions action = new Actions(driver);
	            action.contextClick(rightClickButton).perform();
	            Thread.sleep(2000);
	            // performing the copy click (click on the copy Click in the context menu)
	  By copyLocator =  By.xpath("//ul[@class='context-menu-list context-menu-root']//li/span[text()='Copy']");
	          WebElement copyClickButton =     driver.findElement(copyLocator);
	            copyClickButton.click();
	            Thread.sleep(2000);
	            
	            // handle the JS ALERT 
	             driver.switchTo().alert().accept();
	             Thread.sleep(2000);
	              
	             
		 
		 
		
	}

}
