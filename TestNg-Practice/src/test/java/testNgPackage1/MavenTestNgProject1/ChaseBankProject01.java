package testNgPackage1.MavenTestNgProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ChaseBankProject01 {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.chase.com/");
		 driver.manage().window().maximize();
		  driver.findElement(By.xpath("//a[@role='button'][text()='Open an account']")).click();
			/*
			 * WebElement ele = driver.findElement(By.
			 * xpath("//a[contains(text(),'Choose a checking account')]")); Actions action =
			 * new Actions(driver); action.moveToElement(ele).perform();
			 */
		  driver.findElement(By.xpath("//a[text()='Open an account >>']")).click();
		 driver.findElement(By.cssSelector("input[id='RadioGroup-skipAppCap.loginRedirect-input-0']")).click();
	
				   Thread.sleep(1500);
		  
		  
		 driver.findElement(By.id("RadioGroup-skipAppCap.loginRedirect-input-0")).click();
		 driver.findElement(By.cssSelector("//button[@type=button")).click();
		 
		   Thread.sleep(45000);
		   driver.close();
	  ;
	       
	}

}
