package seleniumGridStandAloneHubAndNodes;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
// per test will open per session if i execute 5 test case 5 session will open 
//quiting the seesion will be terminated based on 

public class SeleniumGridDemo {
	
	public static void main(String[] args) throws MalformedURLException, Exception {
		// for selenium grid we have to use remote webdriver
		URI gridUri = new URI("http://localhost:4444");
              URL gridRemoteUrl = gridUri.toURL();

		//i want to work with chrome broswer i need to use chrome options 
              ChromeOptions options = new ChromeOptions();
              options.addArguments("--start-maximized").addArguments("--incognito");
		
		
		
		           WebDriver driver = new RemoteWebDriver(gridRemoteUrl,options);
		             driver.get("https://academy.swaroopnadella.com/");
		             System.out.println(driver.getTitle());
		            driver.quit();
		

	}

}
