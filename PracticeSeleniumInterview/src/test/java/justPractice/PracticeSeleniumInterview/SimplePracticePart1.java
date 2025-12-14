package justPractice.PracticeSeleniumInterview;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
public class SimplePracticePart1 {
	public static void main(String[] args) throws Exception {
		
             
		
		
		 RemoteWebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/"); Thread.sleep(1500);
		 driver.manage().window().maximize(); driver.close();
		 
		//this way i shouldnt build framewokr it has to be proper functional
		
		
	}
}
