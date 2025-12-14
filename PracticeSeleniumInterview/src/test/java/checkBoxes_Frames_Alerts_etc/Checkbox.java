package checkBoxes_Frames_Alerts_etc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkbox {
	public static ChromeOptions option;
	public static WebDriver driver;
	public static WebDriverWait wait ;
	public static String url ="https://testautomationpractice.blogspot.com/";
	
	
	
	public static  List<WebElement> clickCheckBoxes( String url )
	{

		option = new ChromeOptions();
		option.addArguments("--start-maximized").addArguments("--incognito");
		driver = new ChromeDriver(option);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get(url);
		By checkBoxLocator = By.xpath("//label[contains(text(),\"Day\")]//parent::div//div");
		List<WebElement> allElements = driver.findElements(checkBoxLocator);
		wait.until(ExpectedConditions.visibilityOfAllElements(allElements));

		
		for (WebElement elements : allElements) {
			elements.click();
			
			System.out.println(elements.getText());
		}
		return allElements;
	}
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) throws InterruptedException {
		
		clickCheckBoxes(url);
	
		

	}

}
