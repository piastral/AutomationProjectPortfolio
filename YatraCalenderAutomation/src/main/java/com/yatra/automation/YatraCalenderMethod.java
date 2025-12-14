package com.yatra.automation;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class YatraCalenderMethod {

	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized", "--disable-notifications");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // synchronizing webdriver handle flaky
		driver.get("https://www.yatra.com");
		
		
	    YatraCalenderAutomation.lowestPriceOfCurrentMonth(wait,0,driver);
	  
		YatraCalenderAutomation.lowestPriceOfNextMonth(wait,1,driver);
		
	}
	/* 1 step -> i  clicked the element 
	 * 2 nds tep found the month locators 2 months (current and next)
	 * i found by locator using by.xpath 
	 * 3 rd step --> using webdriver wait call the method 
	 *  List<Webelemtn>until(ExpectedConditions.visibilityAllElementLocatedBy(calendersMonhtlist)
	 * 4 step- i need to find the index of first popur or current month and next month 
	 * using        WebElememt elemnt =calendMonthList.get(index)
	 * 5- i need to find the price 
	 * 
	 * 
	 *	By priceLocator = By.xpath(".//span[contains(@class,\"custom-day-content \")]"); 
	 * WebElement priceElement = null;
	 *   priceElement=price =By.xpath(".//span[contains(@class,\"custom-day-content \")]"+.//parent::span//parent::div
	 * 
	 */
}
