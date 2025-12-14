package seleniumGridWithDockerMode;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridWithDockerCompose {
/* Selenium grid 4 Standalone Docker Mode using Docker Compose File 
 * 
 * Running each browser - 5 different containers 
 * -chrome ,edge ,firefox -total 15 containers 
 * 
 * starting each of them manually with docker commands is tedious 
 * 
 * We can create an Docker compose yml file ,and specify the required container images information and 
 * ports 
 * ==========================================================
 * Docker compose is a tool that hekps you define and run multi-container Docker 
 * applictaion easily 
 * 
 * We can use YAML FILE TO CONFIGURE OUR APPLICATION services and then use  simple command 
 * to start everything 
 * 
 * 
 * EXAMPLE SYNTAX FOR CREATING DOCKER COMPOSE YAML FILE 
 * 
 * version : "3" /not mandatory 
 * services: -- 
 *  chrome1:user defined text  - service (we can specify anything lets 5 different  chrome browser ill run ill chrome1,chrome2...)
 *   image: selenium/standalone-chrome
 *   ports:
 *      -"4441:4444" 
 * to start we need to use 
 * docker -compose -f docker-compose-browsers.yml up -d
 * 
 * to stop container use "docker compose down"
 * we need to use detached mode to not getting logs 
 * 	
 */
	
	public static void main(String[] args) throws MalformedURLException, URISyntaxException, InterruptedException {
		chromeBrowserTest("4441","First Chrome Container");
		chromeBrowserTest("4442","Second Chrome Container");
	    fireFoxBrowserTest("4451","First Firefox Container");
		fireFoxBrowserTest("4452","Second Firefox Container");
		
		
		System.out.println("Execution Completed :================");
	}
	
	public static void chromeBrowserTest(String port ,String containerName) throws MalformedURLException, URISyntaxException, InterruptedException {
		// hub is going to manage the distribution of test cases to the node
		URI hubURI = new URI("http://localhost:"+port+"/");
		 URL hubRemoteUrl = hubURI.toURL();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized").addArguments("--incognito");
		WebDriver driver = new RemoteWebDriver(hubRemoteUrl, options);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://academy.swaroopnadella.com/");
		System.out.println(driver.getTitle());
		System.out.println("Selenium Grid execution for ChromeBrowser");
		System.out.println(containerName+ " -chrome");
		System.out.println("==================================");
		
		driver.quit();
	}

	public static void fireFoxBrowserTest(String port,String containerName) throws URISyntaxException, MalformedURLException, InterruptedException {
		URI	hubURI = new URI("http://localhost:"+port+"/");
		 URL  hubRemoteUrl = hubURI.toURL();

		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--start-maximized").addArguments("--incognito");

		WebDriver driver = new RemoteWebDriver(hubRemoteUrl, options);
		driver.manage().window().maximize();
		// driver = new RemoteWebDriver(hubRemoteUrl, options);
		driver.get("https://academy.swaroopnadella.com/");
		System.out.println(driver.getTitle());
		System.out.println(containerName + " -firefox");
		System.out.println("Selenium Grid execution for FireFoxBrowser");
		System.out.println("============================");
		//Thread.sleep(4000);
		driver.quit();
		
	}

}
