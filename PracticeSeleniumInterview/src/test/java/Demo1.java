import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// we use this mostly when element not found and no such element exception ...stale element refrence 
		WebElement element =driver.findElement(By.xpath("//input[@name='username']"));
		wait.until(ExpectedConditions.visibilityOf(element)); //webelemt
		element.sendKeys("admin");
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin"); // 1 second
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	WebElement element1 =	driver.findElement(By.xpath("//input[@name='username']"));
	 
		
	}
}
		/* what is the difference between thread.sleep(5000) & implicit wait ?
		 * 
		 * what is the disadvantage and advantage of using implicit wait 
		 * what is thread.sleep(10000) 10 second 
		 * 
		 * thread.sleep will wait for the element to be loaded and then it will execute ,but lets say element response time is 
		 * 1 second and we are give thread.sleep 10 second..it will wait for 10 sec and then it will execute thats why we dont use in real
		 * project because it lacks perfomance issue 
		 * 
		 * 
		 * --------------------------------------------------------------------
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * 
		 * advantage :: it is aslo called global wait
		 * =================================================================================
		 * EXPLICIT WAIT  
		 * 
		 */
		
		
		
	

