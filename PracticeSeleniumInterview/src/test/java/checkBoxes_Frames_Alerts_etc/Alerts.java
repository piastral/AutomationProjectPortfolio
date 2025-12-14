package checkBoxes_Frames_Alerts_etc;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {
	// alert is not webelement w cannot inspect

	public static ChromeOptions option;
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String url = "https://the-internet.herokuapp.com/javascript_alerts";
	public static Alert alert;

	public static void handlingAlerts(String url) throws InterruptedException {
		option = new ChromeOptions();
		option.addArguments("--start-maximized").addArguments("--incognito");
		driver = new ChromeDriver(option);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get(url);
		By alertLocator = By.xpath("//ul[contains(@style,'list-style')]//li//button[contains(text(),'JS A')]");
		WebElement alertElementButton = driver.findElement(alertLocator);
		alertElementButton.click();
		alert = wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(3000);
		alert.accept();
		
		

	}

	public static void handlingSecondAlerts(String url) throws InterruptedException {
		option = new ChromeOptions();
		option.addArguments("--start-maximized").addArguments("--incognito");
		driver = new ChromeDriver(option);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get(url);
		By alertLocator = By.xpath("//ul[contains(@style,'list-style')]//li//button[contains(text(),'JS C')]");
		WebElement alertElementButton = driver.findElement(alertLocator);
		alertElementButton.click();
		alert = wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(3000);
		alert.dismiss();

	}

	public static void handlingAlertsInBox(String url, String text) throws InterruptedException {
		option = new ChromeOptions();
		option.addArguments("--start-maximized").addArguments("--incognito");
		driver = new ChromeDriver(option);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get(url);

		By alertLocator = By.xpath("//ul[contains(@style,'list-style')]//li//button[contains(text(),'JS Prompt')]");
		WebElement alertElementButton = driver.findElement(alertLocator);
		alertElementButton.click();

		alert = wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(6000);
		alert.sendKeys(text);
		alert.accept();
		String alertBox = driver.findElement(By.xpath("//div[@class='example']//p[@id='result']")).getText();
		System.out.println(alertBox);

		if (alertBox.equals("You entered: " + text)) {

			System.out.println("Pass");

		} else {
			System.out.println("Fail");
		}
		driver.quit();

	}

 }
