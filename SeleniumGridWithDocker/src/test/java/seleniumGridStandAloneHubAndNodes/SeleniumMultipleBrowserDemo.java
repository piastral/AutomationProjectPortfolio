package seleniumGridStandAloneHubAndNodes;

import java.io.IOException;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumMultipleBrowserDemo {

	public static URI gridUri;
	public static URL gridRemoteUrl;
	public static ChromeOptions options;
	public static WebDriver driver;
	public static FirefoxOptions options1;
	public static EdgeOptions options2;
	public static String url = "http://localhost:4444";
	

	public static void multipleBrowserTest(String browser) throws IOException, URISyntaxException {

		

	
			gridUri = new URI(url);
			gridRemoteUrl = gridUri.toURL();
			
			
			if (browser.equalsIgnoreCase("chrome")) {
				options = new ChromeOptions();
				options.addArguments("--start-maximized").addArguments("--incognito");
				driver = new RemoteWebDriver(gridRemoteUrl, options);
				driver.get("https://academy.swaroopnadella.com/");
				System.out.println(driver.getTitle());
                 
				

			} else if (browser.equalsIgnoreCase("firefox")) {
				options1 = new FirefoxOptions();
				options1.addArguments("--start-maximized").addArguments("--incognito");
				driver = new RemoteWebDriver(gridRemoteUrl, options1);
				driver.get("https://academy.swaroopnadella.com/");
				System.out.println(driver.getTitle());
				

			} else if (browser.equalsIgnoreCase("edge")) {
				options2 = new EdgeOptions();
				options2.addArguments("--start-maximized").addArguments("--incognito");
				driver = new RemoteWebDriver(gridRemoteUrl, options2);
				driver.get("https://academy.swaroopnadella.com/");
				System.out.println(driver.getTitle());
				

			}else {
				System.out.println("Invalid ");
			}
		

	}

	public static void main(String[] args) throws IOException, URISyntaxException {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		multipleBrowserTest("chrome");
	}

}
