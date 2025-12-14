package seleniumGridWithDockerMode;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridWithDockerUsingHubAndNode {
/* Selenium grid 4 docker mode 
 * 1) Hub and Nodes 
 * 2) Full Distributed Grid 
 * 
 * We will use the docker compose file from official github repo 
 * 
 * ====================================================HUB AND NODE IN DOCKER MODE
 * HUB:: where test case is managed (there will be always 1 hub )
 * Node( will be multiple) where test gets executed 
 * 
 * Hub One docker container - controls the test execution 
 * Nodes==> Each individual browser One container -Actual test Execution 
 * 
 * Execution is controlled By Hub --> http://localhost:4444
 * 
 * docker-compose-v2.yml or docker-compose-v3.yml
 * 
 * -->lets take requitrment --> 3 chrome ,3 edge ,3 firefox browsers 
 * 
 * we willget command from https://github.com/SeleniumHQ/docker-selenium
 * 
 * =================================================================================================
 * so to get the docker compose yml file for hub and node we refre to the website and will delete past standalone image from
 * docker cli and then use the compose file for hub to download the image and spin up the container all by using com mAND PROMPT 
 * for command promt i need to go to file location where my docker compose file is located \
 * 
 * il launch the compose file for docker version 3 only hub will be launched where test case are managed and distributed 
 * across the node 
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
		chromeBrowserTest();
		chromeBrowserTest();
		chromeBrowserTest();
		chromeBrowserTest();
		chromeBrowserTest();
		chromeBrowserTest();
		chromeBrowserTest();
		chromeBrowserTest();
		chromeBrowserTest();
		
		 fireFoxBrowserTest();
		 fireFoxBrowserTest();
		//testNg suite(regression) 20 class ....paralelly run in eclipse without selenium grid lot of time 
		//effortless and save lot of time //it is best for large scale project 
		// grid happens during the sprint and before release the product to the customer 
		//perfomance testing happens before releasing the customer by giving lot of load and 
		//chek that applicatio is cappable to handle so many user in real time 
		System.out.println("Execution Finished ");
	System.out.println("Total execution time taken to run 15 TEST CASE IS in minute ::==> "+ (durationInMillis/1000)%60);
	
	}
static	double durationInMillis;
  

	public static void chromeBrowserTest() throws MalformedURLException, URISyntaxException, InterruptedException {
		// hub is going to manage the distribution of test cases to the node
		long startTime = System.nanoTime();
		URI hubURI = new URI("http://localhost:4444");
		 URL hubRemoteUrl = hubURI.toURL();
		 long endTime = System.nanoTime();
		    long durationInNanos = endTime - startTime;
		    durationInMillis = durationInNanos / 1_000_000.0;

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized").addArguments("--incognito");
		WebDriver driver = new RemoteWebDriver(hubRemoteUrl, options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://academy.swaroopnadella.com/");
		System.out.println(driver.getTitle());
		
				System.out.println("Selenium Grid execution for ChromeBrowser");
          System.out.println("Execution time : " + durationInMillis);
        
		driver.quit();
	}

	public static void fireFoxBrowserTest() throws URISyntaxException, MalformedURLException, InterruptedException {
		URI	hubURI = new URI("http://localhost:4444");
		 URL  hubRemoteUrl = hubURI.toURL();
		 long startTime = System.nanoTime();
		 long endTime = System.nanoTime();
		    long durationInNanos = endTime - startTime;
		    double durationInMillis = durationInNanos / 1_000_000.0;
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--start-maximized").addArguments("--incognito");

		WebDriver driver = new RemoteWebDriver(hubRemoteUrl, options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		// driver = new RemoteWebDriver(hubRemoteUrl, options);
		driver.get("https://academy.swaroopnadella.com/");
		System.out.println(driver.getTitle());
		System.out.println("Selenium Grid execution for FireFoxBrowser");
		System.out.println("Execution time: "+ durationInMillis);
		driver.quit();
		
	}
	

	
	
	
	
	
	

    
    


	

}
