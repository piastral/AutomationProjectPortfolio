package screenShotHeadlessSSLAdBlockExtension;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HeadlessTesting {
/* why we use ChromeOptins class?
 * 1-By using this we can control the setting of the browser ,when we open the browser like plugin,
 * setting ...we can use chromeOption method( browser specific setting)
 * use case==> WE CAN MAKE OUR TEST CASE AS HEADLESS TESTING
 * 
 * 
 * 1-HEADLESS TESTING ==> IF WE USE HEADLESS TESTIING WE WONT BE ABLE TO SEE MY BROWSER IS LAUNCHING 
 * AND THE APPLICATION IS OPENING OR ACTION IS PERFORMIN IT HAPPENS IN THE BACKGROUND 
 * WITHOUT SEEING ANY ACTIONS IN UI---> WILL ONLY GET FINAL TEST OUTPUT AS PASSED OR FAILED
 * 
 * ======================================================================
 * HOW HEADLESS TESTING WORKS
 * Advantage of headless testing ::-->
 * 1-advantage --> we can do multiple task ( since execution happened backend) ,if we use headed mode of test execution we cant do multiple
 * task because it will create problem for execution ,but with headlesss we can easily do it because it runs on background
 * 
 * 2-> faster execution in backend it doesnt need ui on perfromance wise its very faster when we run 100 test cases we will see 
 * how fast it can happen
 * ===============================================================================================
 * DISADVANTAGES :: USER CANNOT SEE ANY ACTION /so understanding the flow/funcitionality of the test becomes tough 
 * 
 * when to prefer? at development of teast case we will prefer headedd testing because that is the first time will interact with our 
 * application
 * when not to prefer ;;;> so lets say my test case already got executed i have seen the ui nowon different test case will be executed 
 * or will be running in CIMODE in those case  we prefer headless testing since we will execute so many test cases so it should be fast
 * =====================================================================================================
 * 	
 */
	public static void main(String[] args) {
		
		// we can run our browser in headless mode using CHROMEOPTIONS
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir") + "\\Screenshot\\headless.png");
		 sourceFile.renameTo(targetFile);
          driver.quit();
	}

}
