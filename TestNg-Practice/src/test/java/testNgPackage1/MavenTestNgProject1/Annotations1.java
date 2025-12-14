package testNgPackage1.MavenTestNgProject1;
/* with the (priority = value) we can say which test case to run first ,if priority is not given 
 * we can run the test case based on alphabeticall order  

 * important point to remmember ..when we initilize the priority on testcase ,that test will be exectued first
 * else depending upon the alphabetical order it will execute lets "a" is first will execute first 
 * 
 * 2-when we are grouping some methods in one different class using the resuable method for regression 
 * or smoke we can do grouping by explicitylt mention this test case belong to certain suite lets say
 * regression or smoke or both 
 * 
 * so in eclipse while on run configuratuion we can browse for groups and whatever we wantto select 
 * lets say regression that perticular test case will execute which belongs to this group.
 * we can only run with that particular test case in run as ...run configuration
 * 
 * 
 */
//
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Annotations1 {
	public  static WebDriver driver;
	
	

	@BeforeClass
	public  void launchWebApp()  throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	@Test  (priority =1)
	public  void emailField() throws Exception {
		driver.findElement(By.name("email")).sendKeys("shahidmasood666@yahoo.com");
		Thread.sleep(2000);
	 
	}
	@Test  (priority =2)
	public void passField( ) throws Exception {
  driver.findElement(By.name("pass")).sendKeys("hajar123");
  Thread.sleep(2000);
	}
	
	
	@Test  (priority =4)
	public  void passEnabled() throws Exception {
		boolean b =driver.findElement(By.id("pass")).isDisplayed();
		if(b==true) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		Thread.sleep(2000);
	}
	@Test  (priority =3 ,groups ="smoke")
	public  void emailEnabled(boolean b) throws Exception {
		 b =driver.findElement(By.id("email")).isDisplayed();
		if(b==true) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		Thread.sleep(2000);
	}
	

	@AfterClass
	public  void closeWebApp() {
		
		driver.close();
 
		
	}
	
}

