package justPractice.PracticeSeleniumInterview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDatePicker_CustomMethod {
	
	//this method is taking three paramter
	static void selectMonthYear(WebDriver driver, String expectedMonth, String expectedYear ,String pastOrFtureDate )
	{
		while (true) {
			String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

			String year = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();

			if (month.equals(expectedMonth) && year.equals(expectedYear)) {
				break;
				
			}
			
          System.out.println("hello");
			
		//	driver.findElement(By.xpath("//span[text()='"+pastOrFtureDate+"']")).click();
			
			if(pastOrFtureDate.equals("PastDate"))
			{
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			} else {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}

		}
			
	}	
	
	static void selectDate(WebDriver driver ,String expectedDate) 
	{
		List<WebElement> allDates = driver .findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td//a"));
		for (WebElement dates : allDates) {
			if (dates.getText().equals(expectedDate)) {
				dates.click();
				break;
			}
		}
	}
		
		
		
	
	
	
	
	
	


	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
		
		
		  String expectedMonth ="June";
		  String expectedYear ="2026";
		  String  expectedDate ="25";
		 
		selectMonthYear(driver, expectedMonth, expectedYear ,"Future" );
		
		selectDate(driver, expectedDate);
		

		
	

		
		
	
		

}

		

	}


