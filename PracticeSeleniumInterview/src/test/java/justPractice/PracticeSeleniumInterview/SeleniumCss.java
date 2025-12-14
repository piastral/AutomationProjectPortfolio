package justPractice.PracticeSeleniumInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCss {

	public static void main(String[] args) throws Exception {
/* 
 *  in css we ca use tage with attributes and combine them and forming css selector 
 *  tag + attribute( attribute is nothing but id,username ,placeholder,class
 *  tags are( whatever is avaialble input # attribute (value)
 *  example ---
 *  ---------------------------------------------------------
 *  1--> tag.id[[[input#username
 *  2-> tag.class [[ tagname#classname}} input.abcd 
 *  3-> tag[attribute='value'] example input[placeholder]
 *  4-> tag.class[attribute='value'] --->> input.abcd[placeholder='value']
 *  ------------------------------------------------------------
 *  our main goal is to find the stable and unique loctaor for our element depending our requirement 
 *  we will choose
 * without tag also it will work ...for id # ,for class dot.,for attribute[] square bracket 
 *if there is multiple words in class name  dont take the second part only take the first part 
 * ------=============================================================================================
 * CSS SELECTOR POPULAR INTERVIEW QUEDSTION 
 * Q1--> HOW CAN WE TRAVERSE USING CSS SELECTOR FROM THE CURRENT NODE ?
 * ans using > greater sign 
 * answer :: in css we can do forward navigation but we cant do backword navigation 
 * but xpath support both forward and backword 
 * div.login-box > form > div
 * 
 * 
 * q--> perfromance css vs xpath 
 * answer ---> almost same 
 * 
 * 		
 */
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		  driver.manage().window().maximize();
		  
		  //username
		WebElement userName= driver.findElement(By.cssSelector("input.input_error[placeholder=Username]"));
		 userName.sendKeys("standard_user");
		 //password
		 WebElement passWord= driver.findElement(By.cssSelector("input#password"));
		  passWord.sendKeys("secret_sauce");
		 //login
		 WebElement login= driver.findElement(By.cssSelector("input.submit-button[value='Login']"));
		  login.click();
		  
		  WebElement productPage= driver.findElement(By.cssSelector("span.title"));
		 String text= productPage.getText();
		  System.out.println(text);
		

	}

}
