package justPracticeProject;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass
{
	
	public static ChromeOptions options;
	public   static WebDriver driver ;
	
		public static WebDriver handleBrowser() // method 
	{
		 options = new ChromeOptions();
		options.addArguments("--start-maximized").addArguments("--incognito");
	    driver = new ChromeDriver(options);
	    driver.get("https://testautomationpractice.blogspot.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    return driver;
	     // inside driver i have browser opening now since its returning something i need to store in someplace and use this 
	    // 
	    
	 }
	
		    

}
