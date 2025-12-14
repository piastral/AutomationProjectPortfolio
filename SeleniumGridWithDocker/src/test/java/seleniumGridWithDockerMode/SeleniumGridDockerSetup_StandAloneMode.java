package seleniumGridWithDockerMode;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridDockerSetup_StandAloneMode {
	
/* go to official selenium website 
 * https://www.selenium.dev/
 * 
 * go to download page -> Selenium server (grid)
 * 
 * click on the repository link 
 * TO run the grid with popular browers using docker see the repository 
 * 
 * github repository for docker selenium 
 * https://github.com/SeleniumHQ/docker-selenium
 * 
 * --------------------------------------
 * Only on standalone container can run on port 4444 at the same time (that mean for each browser differnt 
 * port number should be open alone with to veiw the conatiner also it will be different container for stanAlone)
 * ========================================================================
 * STANDALONE CHROME VERSION 
 * 
 * docker run -d -p 4444:4444 -p 7900:7900 --shm-size="2g" selenium/standalone-chrome:4.35.0-20250808
 * (it will pull the docker chrome image from docker hub ) 
 * point your webdriver test to http ://localhost:4444
 * 
 * To see whats ahppening inside the conatiners 
 * head to http://localhost:7900/?autoconnect=1&resize=scale&password=secret.
 * 
 * imp points 
 * once the session is occupied we cannot execute again in eclipse because in one container it will be full
 * so ill delete manually in im docker dektop the container but the image will still be there
 * and once agian i need to run my test on eclipse it will create new container 
 * 
 * =====================================================================================
 * 
 * STANALONE FIREFOX VERSION 
 * 
 * docker run -d -p 4445:4444 -p 7901:7900 --shm-size="2g" selenium/standalone-firefox:4.35.0-20250808
 * point your webdriver test to http ://localhost:4444
 * 
 * To see whats ahppening inside the conatiners 
 * head to http://localhost:7901/?autoconnect=1&resize=scale&password=secret.
 * 
 * ===============================================================
 * 
 * STANDALONE EDGE VERSION 
 * 
 * docker run -d -p 4446:4444 -p 7902:7900 --shm-size="2g" selenium/standalone-firefox:4.35.0-20250808
 * point your webdriver test to http ://localhost:4444
 * 
 * To see whats ahppening inside the conatiners 
 * head to http://localhost:7902/?autoconnect=1&resize=scale&password=secret.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 	
 */
public static void main(String[] args) throws MalformedURLException, URISyntaxException, InterruptedException {
	chromeBrowserTest();
	fireFoxBrowserTest();
}
	
	
	

	public static void chromeBrowserTest() throws MalformedURLException, URISyntaxException, InterruptedException {
		// hub is going to manage the distribution of test cases to the node
		URI hubURI = new URI("http://localhost:4444");
		 URL hubRemoteUrl = hubURI.toURL();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized").addArguments("--incognito");
		WebDriver driver = new RemoteWebDriver(hubRemoteUrl, options);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://academy.swaroopnadella.com/");
		System.out.println(driver.getTitle());
		System.out.println("Selenium Grid execution for ChromeBrowser");
		Thread.sleep(8000);
		driver.quit();
	}

	public static void fireFoxBrowserTest() throws URISyntaxException, MalformedURLException, InterruptedException {
		URI	hubURI = new URI("http://localhost:4445");
		 URL  hubRemoteUrl = hubURI.toURL();

		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--start-maximized").addArguments("--incognito");

		WebDriver driver = new RemoteWebDriver(hubRemoteUrl, options);
		driver.manage().window().maximize();
		// driver = new RemoteWebDriver(hubRemoteUrl, options);
		driver.get("https://academy.swaroopnadella.com/");
		System.out.println(driver.getTitle());
		System.out.println("Selenium Grid execution for FireFoxBrowser");
		Thread.sleep(4000);
		driver.quit();
		
	}
	

}
