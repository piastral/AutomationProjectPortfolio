package testNgPackage1.MavenTestNgProject1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParameterTestNg {
	
	public static WebDriver driver;
	
/*PARAMETER IN testNg::---->>>>
 * The concept of parameter is already present in Java ,when we need to use methods in testnG and handle
 * cross browser testing we can pass the paramter int TESTng methods and solve it much more efficently
 * 
 * 1-lets say we have 100 different test case and want to run against differnt browser and also want 
 * 	to use different url like prod,pre prod dev testing url we are using it 
 * so to handle such scenario with different test cases  we can pass the parameter in our methods 
 * which will create a distinction and can handle the scenarios
 * ------------------------------------------------------------------------------------------
 * 
 * 
 * 	
 */
	@BeforeTest
	public static void initialiseBrowser() throws Exception {
	
	
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
	}
	
	
	@Test
	public static void launchApp() {
		driver.get("https://www.facebook.com/");
		System.out.println("Launch the Application ");
	}
	
	@Test
	public static void enterLoginDetails() {
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@type='submit']/parent::div")).click();
		driver.findElement(By.id("email")).sendKeys("shahidmasood@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("mohammed123");
		driver.findElement(By.name("login")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	
//	@Test
//	public static void navigateToMyInfo() {
//		driver.findElement(By.xpath("//span[text()='My Info']")).click();
//	}
//	
     
	@AfterTest
	public static void tearDown() throws Exception
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
