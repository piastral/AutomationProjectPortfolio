package pageObjectConcept;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdminTest {
WebDriver driver;
	
	@BeforeClass
	void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test (priority=1)
	void testLogin()
	{
		LoginPage1 lPage= new LoginPage1(driver);
		lPage.setUserName("Admin");
		 lPage.setPassword("admin123");
		 lPage.clickLogin();
		 Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	 
    
	
	@Test ( priority=2 )
	void adminSearch() throws Exception
	
	{
		Thread.sleep(5000);
		AdminPage ap= new  AdminPage(driver);
		 ap.adminClick();
	}
	
	@Test (priority=3 )
	void userSearch() {
		AdminPage ap= new  AdminPage(driver);
		ap.userNameSearch("Shahid");
	}

	
	@AfterClass
	void tearDown() throws Exception 
	{
		Thread.sleep(5000  );
		driver.quit();
	}
	

	
	
	
	
	

}
