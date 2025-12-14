package justPractice.PracticeSeleniumInterview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Auto suggestion dropdown 
 * in order to work with auto suggestion dropdown  lets say in search box in google juts type selenium java 
 * and then the auto suggestion comes up , so i want to find the locators of all the element in auto suggestion 
 * tomorrow might be search result might differ ,so i have to have dynamic xpath to handle the suggestion dropdwon
 * 
 * 
 * 
 * 
 */

public class AutoSuggestionDropdown {

	public static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@role='combobox']")).sendKeys("selenium java");
		List<WebElement> allEle = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	
		for (WebElement suggestion : allEle) 
		 {
		 
                if(suggestion.getText().equals("selenium java interview questions"))
                {
                	suggestion.click();
                	break;
                }
		 }
		//driver.quit();
		

	}
}
