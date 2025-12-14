package seleniumGridStandAloneHubAndNodes;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MultipleBrowserInParrllelMode {
	public static URI hubURI;
	public static URL hubRemoteUrl;

	public static void chromeBrowserTest() throws MalformedURLException, URISyntaxException, InterruptedException {
		// hub is going to manage the distribution of test cases to the node
		hubURI = new URI("http://localhost:4444");
		hubRemoteUrl = hubURI.toURL();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized").addArguments("--incognito");
		WebDriver driver = new RemoteWebDriver(hubRemoteUrl, options);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://academy.swaroopnadella.com/");
		System.out.println(driver.getTitle());
		System.out.println("Selenium Grid execution for ChromeBrowser");
		Thread.sleep(4000);
		driver.quit();
	}

	public static void fireFoxBrowserTest() throws URISyntaxException, MalformedURLException, InterruptedException {
		hubURI = new URI("http://localhost:4444");
		hubRemoteUrl = hubURI.toURL();

		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--start-maximized").addArguments("--incognito");

		WebDriver driver = new RemoteWebDriver(hubRemoteUrl, options);
		// driver = new RemoteWebDriver(hubRemoteUrl, options);
		driver.get("https://academy.swaroopnadella.com/");
		System.out.println(driver.getTitle());
		System.out.println("Selenium Grid execution for FireFoxBrowser");
		Thread.sleep(4000);
		driver.quit();
		
	}

	public static void main(String[] args) throws MalformedURLException, URISyntaxException, InterruptedException {
		
		chromeBrowserTest();
		fireFoxBrowserTest();

	}

}
