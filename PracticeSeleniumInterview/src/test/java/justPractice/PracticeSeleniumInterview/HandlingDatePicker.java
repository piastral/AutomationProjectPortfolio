package justPractice.PracticeSeleniumInterview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDatePicker {
	/*
	 * we are here handling date pickers :: it is like calender we open the calender
	 * we have to select data month year and retrieve element format can be
	 * different in date but the logic will e same
	 * 
	 * we can follow 2 approach 1st is manually we can enter date and it will take
	 * the value if not we have to choose the calender and pick a date from there
	 * (using common xpath and than looping and select the date)
	 * ============================================================================
	 * real website date picker for 1-date of birth( there will be only past dates
	 * and current month will be available )
	 * 
	 * 2->we want to book some movies or flight ticket or train tickets (generally
	 * the current date or future date ) not the past dates
	 * 
	 * based on the requirement we will use pur date picker logic will be differ
	 * based on the project lets say healthcare appointment ..in this case only
	 * current and future date will be avaialble for selection
	 * 
	 * =============================================================================
	 * ======================
	 *
	 */

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);

		// 1st APPROACH sending the date manually in checkbox and choose the date
		// (typing the date value in text box)
		// date format syntax mm/dd/yyyy
		// driver.findElement(By.id("datepicker")).sendKeys("06/28/2025");

		// this line of code will help me to choose the blank field and will choose the
		// date
		driver.findElement(By.id("datepicker")).click();

		// 2ND APPROACH :: we will only follow if there no ckecbox to enter the date
		// select date,month and year using the calender
		// BASED ON THE CONDITION ILL CHOOSE THE DATE
		String expectedMonth = "June";
		String expectedDate = "25";
		String expectedYear = "2029";

		// now ill use loop to while loop for condition based

		// 2nd i need to find the month and year using common xpath

		/*
		 * Here IN THE DOWN INSIDE WHILE LOOP I AM GOVING ONE CONDITION TRUE AND I AM
		 * FIND THE LOCATOR FOR THE YEAR AND MONTH IF THE YEAR THE MONTH MEETS EXPECTED
		 * YEAR AND EXPECTED MONTH ILL STAY ON THE SAME PERIOD BUT IF (EXPECTED AND
		 * ACTUAL DOESNT MATCH) IT WILL BREAK THE IF STATEMENT THAT FOLLOW MY
		 * INSTRUCTION AND TRIGGER DEPENDING ON THE REQUIREMENT CLICK THE PAST BUTTON
		 * DATE OR FUTRE BUTTON DATE UNTIL THE EXPECTED AND ACTUAL BECOOMES TRUE
		 * 
		 * HERE ONLY WE ARE ONLY COMAPRING YEAR AND MONTH FOR DATE WE NEED TO USE FOR
		 * EACH LOOP
		 * based ont he website the approach will be different 
		 * 
		 * 
		 */

		while (true) {
			String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

			String year = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();

			if (month.equals(expectedMonth) && year.equals(expectedYear)) {
				break;
				
				
			}
			
			

			// either go to next or either or go to back or preveious // FOR FUTURE or past
			// date
			driver.findElement(By.xpath("//span[text()='Next']")).click();

			// FOR PAST DATE
			// driver.findElement(By.xpath("//span[text()='Prev']")).click();

		}

		List<WebElement> allDates = driver .findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td//a"));
		for (WebElement dates : allDates) {
			if (dates.getText().equals(expectedDate)) {
				dates.click();
				break;
			}
		}

	}

}
