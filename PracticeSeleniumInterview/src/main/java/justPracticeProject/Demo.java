package justPracticeProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo {
	//webdriver super interface parent interface of chromedriver 
	
	public static void main(String[] args) {
		   ChromeDriver driver = new ChromeDriver();
		 
		   
		   WebDriver driver1 = new ChromeDriver();
		   // line 14 talks about we can create object of chromedriver but the refrence type will always will be webdriver type which is parent 
		   //it also says webdriver says since it is interface whatever methods you have implemented from me ony display that methods 
		   //infact you can only display that methods which is implemented by chromedriver for webdriver 
		   
		   RemoteWebDriver driver2 = new ChromeDriver();
		   
	
	}

}
