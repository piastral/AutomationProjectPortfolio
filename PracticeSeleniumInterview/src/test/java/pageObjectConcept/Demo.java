package pageObjectConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement (By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		driver.findElement (By.xpath("//input[@Placeholder='Password']")).sendKeys("admin123");
		driver.findElement (By.xpath("//button[normalize-space()='Login']")).click();

		driver.findElement (By.xpath("//div[@class='oxd-sidepanel-body']/ul/li[1]")).click();
		
		driver.findElement (By.xpath("//div[@class='oxd-table-filter']//following-sibling::input[contains(@class,'oxd-input ')]"))
		.sendKeys("shahid");
		Thread.sleep(5000);
		driver.findElement (By.xpath("//div[@class='oxd-table-filter']//following-sibling::div[contains(@class,'oxd-select-wrapper')][1]")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}

}
