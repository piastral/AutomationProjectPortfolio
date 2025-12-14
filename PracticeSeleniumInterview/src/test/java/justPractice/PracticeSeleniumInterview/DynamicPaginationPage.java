package justPractice.PracticeSeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationPage {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	
		 driver.findElement(By.xpath("//a[@href=\"https://demo.opencart.com/admin/\"]")).click();
		 
			Thread.sleep(5000);
		WebElement username=driver.findElement(By.xpath("//input[@name=username]"));
		 username.clear();
		 username.sendKeys("demo");
	WebElement pasword=	 driver.findElement(By.xpath("//input[@name=password]"));
	        pasword.clear();
	        pasword.sendKeys("demo");
		
		 driver.findElement(By.xpath("//button[@type=submit]")).click();
		   
		   driver.findElement(By.xpath("//a[text()='Customers'][1]")).click();
		
	}

}
