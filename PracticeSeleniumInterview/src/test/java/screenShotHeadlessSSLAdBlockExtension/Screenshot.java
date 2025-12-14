package screenShotHeadlessSSLAdBlockExtension;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Screenshot {
	public static File sourcefile;
	public static TakesScreenshot ts;
	public static WebDriver driver;
	public static File targetFile;

	/*
	 * before selenium 4 ,till selennium 3 we had to tvake screenshot for full page
	 * and then somechanges happened with selenium 4 and from here we can also take
	 * screenshot of particular portion on the webpage those method we will get from
	 * webelement not takescreenshot interface // how to capture SCREENSHOT /*3
	 * APPROACH ;;;FULL PAGE ( WITH TAKESCREENSHOT) 2- SPECIFIC AREA OF THE PAGE 3-
	 * WITH WEBELEMENT
	 * 
	 */
	
	public static void captureScreenshot(String location ,String Url) //"user.dir") + "\\Screenshot\\fullPage.png
	
	
	{
		
       driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get(Url);
		driver.manage().window().maximize();
		ts=(TakesScreenshot)driver;
		sourcefile =ts.getScreenshotAs(OutputType.FILE);
		targetFile =new File(location);
		sourcefile.renameTo(targetFile); 
		
	}
	public static void main(String[] args) throws IOException {
		
	
	
	//takeScreenshot(System.getProperty("user.dir") + "\\Screenshot\\faceBook.png" ,"https://www.facebook.com/");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		// 1) capture full page screenshot (using taking screenshot)

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir") + "\\Screenshot\\fullPage.png");

		// this method will help to copy the source file from memory to my desired
		// location so that we can see the file
		sourceFile.renameTo(targetFile);
		
		 // 2) approach  only to get featured product from nocommerce  from specific section
		
		 
			/*
			 * WebElement desiredScreenshot = driver.findElement(By.
			 * xpath("//div[@class='product-grid home-page-product-grid']")); File
			 * sourceFile1= desiredScreenshot.getScreenshotAs(OutputType.FILE); File
			 * targetFile1 = new File(System.getProperty("user.dir") +
			 * "\\Screenshot\\specific page.png"); sourceFile1.renameTo(targetFile1);
			 */
	   //3 capture only single web element like logo
	  
	  
		WebElement singleLogo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourceFile1=   singleLogo.getScreenshotAs(OutputType.FILE);
		  
		  File targetFile1 = new File(System.getProperty("user.dir") + "\\Screenshot\\logo.png");
		  sourceFile1.renameTo(targetFile1);
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
