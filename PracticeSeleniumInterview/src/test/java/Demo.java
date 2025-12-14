import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	Dimension d= new Dimension(450, 650);
	driver.manage().window().setSize(d);
	
	WebElement element=driver.findElement(By.xpath("//input[@name='username']"));
	
	
	
	
	
	
	
	//	System.out.println(driver.manage().window().getSize());
		
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		WebElement elementTab =driver.findElement(By.xpath("//div[contains(@class,'oxd-sidepanel-body')]//ul//li//a//span[text()='Admin']"));
if (elementTab.isDisplayed())
{
	System.out.println("Pass");
	System.out.println(elementTab.getText());
}else {
	System.out.println("Fail");
	System.out.println(elementTab.getText());
}
	
	
	 
	driver.findElement(By.xpath("//i[contains(@class,'oxd-icon bi-caret-down-fill oxd-userdropdown-icon')]")).click();
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	Thread.sleep(3000);
	driver.quit();
	
	int arr[]   =new int[5];
	arr[1] = 123;
	arr[2] =456 ;
	arr[3] = 678;
	
	
	

		
		
		
		
		
	}	

}
