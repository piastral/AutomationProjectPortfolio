package com.testNg.practice;

import static org.testng.Assert.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.testng.annotations.Test;

public class PracticeTestNgWithMehtods {
	protected WebDriver driver;
	protected WebDriverWait mywait;
	
	

	// first test case will be click all categories button

	@Test(priority = 1)
	public void launchApp() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	// find under trending section after clicking all button how many elements is
	// available

	@Test(priority = 2)
	public void checkButtonsUnderAll() {
		WebElement allButtonCheck = driver
				.findElement(By.xpath("//a[@role='button'  and @aria-label=\"Open All Categories Menu\" ]"));
		allButtonCheck.click();
		String expectedText = "All";
		String actualTest1 = allButtonCheck.getText();
	assertEquals(actualTest1, expectedText);
		System.out.println(actualTest1);
		

		 mywait = new WebDriverWait(driver, Duration.ofSeconds(20));

		List<WebElement> buttonsUnderAllCategoriesTrending = driver.findElements(By.xpath(
				"//section[contains(@class,'category-sec' ) and contains(@aria-labelledby,'Trending')]//div/parent::section//following-sibling::ul//li//a"));
		 mywait.until(ExpectedConditions.visibilityOfAllElements(buttonsUnderAllCategoriesTrending));

		String[] expectedArray = { "Best Sellers", "New Releases", "Movers & Shakers" };
//now i need to convert my expectdArray into list otherwise ill not be able to asert 

		List<String> expectedList = Arrays.asList(expectedArray);
		List<String> actualList = new ArrayList<String>();

		for (WebElement el : buttonsUnderAllCategoriesTrending) {
			System.out.println(el.getText());
			String text = el.getAttribute("textContent").replaceAll("\\s+", " ").trim();
			if (!text.isEmpty()) {
				actualList.add(text);
			}
		}

		assertEquals(actualList, expectedList );

	}

}
