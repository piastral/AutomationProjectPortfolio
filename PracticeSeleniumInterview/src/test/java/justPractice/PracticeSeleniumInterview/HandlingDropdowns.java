package justPractice.PracticeSeleniumInterview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns {
	public  static  WebDriver driver;
	public static  Select select;
	public static final String url="https://testautomationpractice.blogspot.com/";
	public  List <WebElement> options;
	
	
	
	public static void selectByVisibleText (String url ,String text)
	{

	 	 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get(url);
		driver.manage().window().maximize();
		 WebElement dropDown =driver.findElement(By.xpath("//select[@id='country']"));
		  select = new Select(dropDown);
		  select.selectByVisibleText(text);
		  
		driver.quit();
	}
	
	public static void selectByIndex(String url ,int Index) 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get(url);
		driver.manage().window().maximize();
		 WebElement dropDown =driver.findElement(By.xpath("//select[@id='country']"));
		  select = new Select(dropDown);
		  select.selectByIndex(Index);
		  driver.close();
	}
	
	public static void selectByValue(String url ,String value) 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get(url);
		driver.manage().window().maximize();
		 WebElement dropDown =driver.findElement(By.xpath("//select[@id='country']"));
		  select = new Select(dropDown);
		 select.selectByValue(value);
		 driver.close();
		 
		
	}
	
	public  List<WebElement> selectByOptions (String url )
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get(url);
		driver.manage().window().maximize();
		 WebElement dropDown =driver.findElement(By.xpath("//select[@id='country']"));
		  select = new Select(dropDown);
	       options=select.getOptions();
	       
	       
	   
	 	  
	       return options;

		 
	}
//==================================================================================================
	//BOOTSTRAP DROP DOWN ==> WITHOUT ANY SELECT TAG ,WE CAN FIND WITH THE HELP DIV , BUTTON
	// WE CAN SELECT MULTIPLE OPTIONS 
	
	// somehow the website is not avaialbe 
	
	
	
	
	public static void main(String[] args) 
	
{
	
		selectByVisibleText(url,"Australia");
		selectByIndex(url,9);
		selectByValue(url,"brazil");
		
		
		
		HandlingDropdowns ListCountry = new HandlingDropdowns();
	      List<WebElement> countryOptions =ListCountry.selectByOptions(url);
	      String text;
	      System.out.println("HERE IS THE LIST OF ALL OPTIONS IN SELECT CLASS ::");
	      for(WebElement country :countryOptions)
	      {
	    	   text = country.getText();
	    	 
	    	  System.out.println(text);
	    	  
	    	
	      }
	     
		
		
		
		
		
		
		
		
		
	
	/*
	 * There are three types of dropdown 1-->> select dropdown ( whenever there is
	 * select tag in html we will confirm that is select dropdown but if we see div
	 * , or button or any other tags thats comes under boot strap or hidden dropdown
	 * 
	 * 
	 * 2--->> bootstrap dropdowm
	 * 
	 * 
	 * 
	 * 
	 * 3--->> hidden drop drown
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	
		// we will handle select dropdown now

		

		// we have to use select class to handle the select type of document not every
		// dropdown only select dropdown
		
		//BELOW SELECT DROPDOWN:::====>>
//===========================================================================================
	
		//auto suggestion
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		//===========================================================
		
		//THIS IS BOOTSTRAP DROPDOWN
	//	=========================================================================================================================
		// now we will check bootstrap dropdown we will see button tag,div tag 
		//1- single select option 
	/*
	 * driver.findElement(By.
	 * xpath("//button[contains(@class,'multiselect dropdown')]")).click();
	 * 
	 * 
	 * //2- find the size of all options List <WebElement> allOptions=
	 * driver.findElements(By.
	 * xpath("//button[contains(@class,'multiselect dropdown')]/following-sibling::ul//label"
	 * )); System.out.println("The number of Options available are "+
	 * allOptions.size());
	 */

	/*
	 * for(int i=0;i<allOptions.size();i++) {
	 * 
	 * System.out.println(allOptions.get(i).getText()); }
	 */
    
	/*
	 * System.out.println("Here are the list of countries -: "); for(WebElement
	 * option:allOptions) { System.out.println(option.getText()); }
	 */
    
    //4- select multiple options and check and click multiple option
    
	/*
	 * for (WebElement listCountry : allOptions) { String op= listCountry.getText();
	 * 
	 * if(op.equals("Java") || op.equals("Bootstrap") || op.equals("HTML")) {
	 * listCountry.click(); } }
	 */
    //=========================================================================================================================
		
	//	=================================================================================================
				//HIDDEN DROP DOWN or auto suggestion
		
		

		
		
		
		
		
	}
}
