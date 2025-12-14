package justPractice.PracticeSeleniumInterview;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
	/*
	 * ny my assignment is using keyboard action 1-> write a text(using sendkeys)
	 * 2-> select text using(ctrl +a ) 3-> copy the text using (ctrl +c) 4-> move
	 * the text into different field ( using ) tab 5-> paste the text using (ctrl +v
	 * ) in new tab
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {

		/*
		 * //1- send hello in area 1 WebElement textArea1=
		 * driver.findElement(By.id("inputText1")); textArea1.sendKeys("hello");
		 * 
		 * //2 select the hello text (ctrl+a ) //we will handle ctrl(using keydown) once
		 * we select then we go release for that we use(keyUp)
		 * actObject.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		 * 
		 * //3 copy the hello text (ctrl + c )
		 * 
		 * actObject.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		 * 
		 * 
		 * //4 use tab to go to next field
		 * actObject.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		 * 
		 * //5 use ctrl+v to paste the desired text
		 * 
		 * actObject.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		 * 
		 * // ctrl + shift +a
		 * actObject.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.
		 * SHIFT).keyUp(Keys.CONTROL).perform();
		 * 
		 * //enter key actObject.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		 */

		// click and tab

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://academy.swaroopnadella.com/");
		driver.manage().window().maximize();
		Actions actObject = new Actions(driver);

		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window Hanlde " + parentWindowHandle);

		WebElement webinarLinkButton = driver.findElement(By.xpath("//a[@href=\"/sessions#nav_bar\"]"));
		actObject.keyDown(Keys.CONTROL).click(webinarLinkButton).keyUp(Keys.CONTROL).perform();

		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {
			System.out.println("check the hanlde" + handle);

			if (!handle.equals(parentWindowHandle)) {
				driver.switchTo().window(handle);
				WebElement newText = driver
						.findElement(By.xpath("//p[text()='No webinar scheduled yet. Please check back later']"));
				System.out.println("The text in new winow is ::" + newText.getText());

			}
		}

		driver.switchTo().window(parentWindowHandle);
		Thread.sleep(7000);
		String text = driver.findElement(By.xpath(" //h1[text()='Learn with Swaroop Nadella']")).getText();
		System.out.println(text);
		driver.quit();

	}

}
