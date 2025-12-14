package justPractice.PracticeSeleniumInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	  WebElement dropDown =  driver.findElement(By.xpath("//select[@id='country']"));
	  Select select = new Select(dropDown);
	  Thread.sleep(6000);
	  select.selectByValue("canada");
	  Thread.sleep(6000);
	
	
	    
		
		
		
	}

}
