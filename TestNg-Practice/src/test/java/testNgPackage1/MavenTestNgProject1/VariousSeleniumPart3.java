package testNgPackage1.MavenTestNgProject1;

public class VariousSeleniumPart3 {
/*1) What is Selenium WebDriver?
Answer: Selenium WebDriver is a tool for automating web applications. It allows you to interact
 with web elements like clicking buttons, entering text, and navigating between pages, all through code.
2) What are the advantages of using Selenium?
Answer:
It's open-source, so it's free to use.
It supports multiple programming languages, like Java, Python, and C#.
Selenium can run tests across different browsers (Chrome, Firefox, Safari, etc.).
It can be integrated with tools like Jenkins for continuous integration.
3) How do you find elements in Selenium?
Answer: You can find elements using locators like id, name, className, tagName, linkText, 
partialLinkText, cssSelector, and xpath. For example:
WebElement element = driver.findElement(By.id("elementId"));
4) What is the difference between findElement() and findElements()?
Answer:
findElement() finds the first matching element on the page and returns a single WebElement. 
If no element is found,
 it throws a NoSuchElementException.
findElements() returns a list of all matching elements. If no elements are found, it returns an empty list.
5) What is the difference between get() and navigate().to() in Selenium?
Answer:
get() opens a web page and waits until the page is fully loaded.
navigate().to() is used to navigate to a web page but does not wait for the page to fully load.
 You can also use navigate() to go back, forward, or refresh the page.
6) How do you handle dropdowns in Selenium?

Answer: You can handle dropdowns using the Select class. Here’s an example:
Select dropdown = new Select(driver.findElement(By.id("dropdownId")));
dropdown.selectByVisibleText("Option 1");
7) How do you handle alerts and pop-ups in Selenium?
Answer: You can handle alerts using the Alert class. For example:
Alert alert = driver.switchTo().alert();
alert.accept(); // To click "OK"
alert.dismiss(); // To click "Cancel"

8) What is an implicit wait in Selenium?
Answer: Implicit wait tells Selenium to wait for a certain amount of time before throwing a
 NoSuchElementException. It's applied globally to all elements.
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

9) What is an explicit wait in Selenium?
Answer: Explicit wait is used to wait for a specific condition to be met before proceeding. It’s more precise than implicit wait.
WebDriverWait wait = new WebDriverWait(driver, 20);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));
10) What is the difference between driver.close() and driver.quit()?
Answer:
driver.close() closes the current browser window.
driver.quit() closes all browser windows and ends the WebDriver session.
--------------------------------------------+++++++++++++++++++++++++++------------------------------------


 *Q1 How do you handle calendars in Selenium?
A1 Using JavaScript Executor
Why? Use JavaScript Executor when you need to directly set a date without interacting with the calendar UI.

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("document.getElementById('datepicker').value='2024-07-02'");

Q2 What if interacting with the calendar UI is required to select a date?
A2 Using the Manual Method by Clicking
Why? Use the manual method when you need to navigate through the calendar by clicking "Next" or "Previous"
 until you reach the desired month and year.

while (!(month.equals("July") && year.equals("2024"))) {
 driver.findElement(By.xpath("next button locator")).click();
}
driver.findElement(By.xpath("date locator")).click();

Q3 What if your calendar doesn't clearly display the full date instead it have separate dropdowns, 
and you need to select it?
A3 Using Dropdowns for Month and Year
Why? This method is ideal when the calendar provides dropdowns, allowing you to select the month and
 year directly.

Select selectMonth = new Select(monthDropdown);
selectMonth.selectByVisibleText("Apr");

Select selectYear = new Select(yearDropdown);
selectYear.selectByVisibleText("2024");

dateElement.click(); 
 * 
 */
}
