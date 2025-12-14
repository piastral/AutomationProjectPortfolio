package com.yatra.automation;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YatraCalenderAutomation {
	/*
	 * requirement to test it out the yatra.com the webpage 1-book bus from one
	 * location to another location (using selenium find the locators store the
	 * locators interct with elements) 2-use explicit wait ,use dynamic locators,
	 * also dynamic x path this lecture has been created in this way will help the
	 * coding rounds \ 3- along with we wil revisit the collection 4-also how to
	 * handle the calenders
	 * =============================================================================
	 * ========================= ASSIGNMENT :Automate calender handling and fare
	 * selection on yatra.com Objective: Automate the selection of travel dates with
	 * the lowest fare using Selenium WebDriver and Java Instruction :: 1-Launce
	 * Yatra.com
	 * 
	 * 2- Click on the departure date calender using the default selected cities (eg
	 * Delhi to Mumbai)
	 * 
	 * 3- Find Date with the lowest fare in the current month
	 * 
	 * 4- Find Date witj the lowest fare of next month
	 * 
	 * 5- Find the lowest fare in both months combined
	 * 
	 * =========================================================== EXPECTED OUTCOME
	 * 
	 * 1 The program should open calender 2- Identify the date with lowest fare in
	 * the correct Month 3- Identify the date with lowest fare in the next month
	 * 4-From all the visible dates (current and next month) identify the lowest
	 * fare
	 * 
	 * Submit in github repo link ::
	 * 
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {

		
		/*
		 * Thread.sleep(2000);
		 * 
		 * By currentDateLocator = By.xpath(
		 * "//div[@class=\"react-datepicker__month-container\"][1]//div[@class=\"react-datepicker__week\"]//div"
		 * ); By nextDateLocator = By.xpath(
		 * "//div[@class=\"react-datepicker__month-container\"][2]//div[@class=\"react-datepicker__week\"]//div"
		 * );
		 * 
		 * // this is also called chaining of webelement
		 * 
		 * // List<WebElement> dateList = .findElements(currentDateLocator);
		 * 
		 * // why find elements because i am getting so many dates
		 */
		/*
		 * Line number 124 and 104 is pure logic what i am doing here i already have the
		 * xpath for price locator also i have assign the list of webelement into
		 * webelemtn price now the logic is i dont want to write double instead what i
		 * can do create webelemen initilze the dataEelment to null; then inside if
		 * block make sure you assign price which was having list of prices filtered
		 * inside if block and assign into dataelement
		 * 
		 * 
		 * 
		 * 
		 */

	}
	//==================================================================================================================================================================================

	public static WebElement currentMonth(int index, WebDriverWait wait) {
		By calenderMonthLocator = By.xpath("//div[@class=\"react-datepicker__month-container\"]");
		List<WebElement> calendersMonthList = wait
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(calenderMonthLocator));
		//System.out.println(calendersMonthList.size());
		// here i m choosing index which will give me the first index from 2 pop-uo
		WebElement monthCalender = calendersMonthList.get(index); // this is first index which will be 0
		return monthCalender;
	}

	public static WebElement nextMonth(int index, WebDriverWait wait) {
		By calenderMonthLocator = By.xpath("//div[@class=\"react-datepicker__month-container\"]");
		List<WebElement> calendersMonthList = wait
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(calenderMonthLocator));
		System.out.println(calendersMonthList.size());
		WebElement monthCalender = calendersMonthList.get(index);
		return monthCalender;
	}
	//=====================================================================================================================================================================================

	public static void lowestPriceOfCurrentMonth(WebDriverWait wait, int index,WebDriver driver ) throws InterruptedException { /// whoever
		/// will

		departureDateButton(wait).click();
		Thread.sleep(2000);
		WebElement currentMonth = currentMonth(index, wait); // inside curent month i have all the dates weeks
		
		int lowestPrice = Integer.MAX_VALUE; // max value 5215151515
		WebElement priceElement = null;
		Thread.sleep(2000);
		By priceLocator = By.xpath(".//span[contains(@class,\"custom-day-content \")]");
		List<WebElement> octoberPriceList = currentMonth.findElements(priceLocator);

		for (WebElement price : octoberPriceList) {
			String priceString = price.getText();
			//System.out.println("This is price of tickets for current Month"+priceString);
			if (priceString.length() > 0) {
				priceString = priceString.replace("₹", "").replace(",", "");
           System.out.println(priceString);
				int priceInt = Integer.parseInt(priceString);
				if (priceInt < lowestPrice) {
					lowestPrice = priceInt;
					priceElement = price; // my xpath also got initilized old

				}
			}

		}
		Thread.sleep(2000);
		WebElement dateElement = priceElement.findElement(By.xpath(".//parent::span//parent::div"));
		System.out.println(dateElement.getAttribute("aria-label") + " which is ₹ " + lowestPrice);
		
		
		 //Adding at the end will close first this method 
		    // Close the calendar so next method can safely open it again
		    Actions actions = new Actions(driver); 
		    actions.sendKeys(Keys.ESCAPE).perform();
		    Thread.sleep(1000); // small pause to ensure calendar closes fully
		
		
		
	}
//============================================================================************************======================================================================================================

	public static void lowestPriceOfNextMonth(WebDriverWait wait, int index,WebDriver driver) throws InterruptedException { /// whoeve
	
		departureDateButton(wait).click();
		Thread.sleep(2000);
		WebElement currentMonth = currentMonth(index, wait);
		int lowestPrice = Integer.MAX_VALUE;
		WebElement priceElement = null;
		Thread.sleep(2000);
		By priceLocator = By.xpath(".//span[contains(@class,\"custom-day-content \")]");
		List<WebElement> octoberPriceList = currentMonth.findElements(priceLocator);

		for (WebElement price : octoberPriceList) {
			String priceString = price.getText();
			if (priceString.length() > 0) {
				priceString = priceString.replace("₹", "").replace(",", "");
// System.out.println(priceLists);
				int priceInt = Integer.parseInt(priceString);
				if (priceInt < lowestPrice) {
					lowestPrice = priceInt;
					priceElement = price;

				}
			}

		}
		Thread.sleep(2000);
		WebElement dateElement = priceElement.findElement(By.xpath(".//parent::span//parent::div"));
		System.out.println(dateElement.getAttribute("aria-label") + " which is ₹ " + lowestPrice);
		
		// ✅ Add this here — at the END of the method
	    // Close the calendar so next method can safely open it again
	    Actions actions = new Actions(driver); // get driver from wait
	    actions.sendKeys(Keys.ESCAPE).perform();
	    Thread.sleep(1000); // small pause to ensure calendar closes fully

	}
	
	
	//=============================================================

	public static WebElement departureDateButton(WebDriverWait wait) {
		By departureDateLocator = By.xpath("//div[@role=\"button\" and @aria-label=\"Departure Date inputbox\"]");
		WebElement departureDateButton = wait.until(ExpectedConditions.elementToBeClickable(departureDateLocator));
		return departureDateButton; /// this is my first step 
	}

}
