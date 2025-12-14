package checkBoxes_Frames_Alerts_etc;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.Command;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//with the help of actions class we can mov
		Actions actions = new Actions(driver);
		
		actions.moveToElement(null).perform();
		
		//ctrl +v
		actions.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).perform();
		actions.sendKeys(Keys.ENTER).perform();
		
		
		
		
		

	}

}
