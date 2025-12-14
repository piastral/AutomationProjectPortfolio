package screenShotHeadlessSSLAdBlockExtension;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestIncognitoMode {

	
	
	public static void main(String[] args) {
		// we want to open our application in icognito mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		// now we will enable extension at Runtime the extension then can be used 
		options.setExperimentalOption(null, options);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		
	}
}
