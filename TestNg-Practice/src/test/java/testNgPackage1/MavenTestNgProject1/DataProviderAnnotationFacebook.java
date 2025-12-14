package testNgPackage1.MavenTestNgProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotationFacebook {
	public static  WebDriver driver;

	@BeforeMethod
	public static  void launchWebApp()  throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);	
	}
	
	@AfterMethod
	public static void closeApp() {
		driver.close();
	}
	
	/*Data provider ::-->>
	 * to perform any validation or cheking the login functionality repetadely by passing username and 
	 * password we will not hardcode so we use the dataprovider concept the get the required data 
	 * to execute test case ..also when we implement data driven testing we can use the concept of 
	 * data provider also we can implement the data from excel using data provider 
	 * 
	 * 
	 * 
	 */
	
	//create data provider annotations 

	@DataProvider 
	public  Object [][] data(){
		Object [][] obj = new Object[3][2]; // 2d array consist of 3  rows and 2 column
		obj[0][0]="shahidmasood666@yahoo.com";obj[0][1] ="hajar12";
		obj[1][0] ="fazalm1961@yahoo.com";obj[1][1]="fazal9133";
		obj[2][0] ="hajar123@gmail.com"; obj[2][1]="hajar123";
		
		return obj;
		
		
	}
	
	@Test (dataProvider ="Test Data")
	public static void m1(String uid ,String pwd ) throws Exception {
		driver.findElement(By.id("email")).sendKeys(uid);
		Thread.sleep(1500);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
	}

}
