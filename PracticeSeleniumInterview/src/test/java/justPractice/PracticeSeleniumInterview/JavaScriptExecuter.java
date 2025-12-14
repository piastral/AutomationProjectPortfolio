package justPractice.PracticeSeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class JavaScriptExecuter {
	
/* Javascript Executor is an interface and it is implemented by RemoteWebdriverclass
 * executeScript() - we can execute javascript statement inside the browser 
 * sometimes when we want to use action method like click, or sendkeys it doesnt work  
 * why? it might not work ?
 * for an instance one element is overlapping with one another element in those case we will receive 
 * ELEMENTCLICKINTERCEPTEDEXCEPTION===> in order to handle this kind of exception we use 
 * javascript sxecuter===> executeScript and pass the CLICK OR SENDKEYS AS PARAMETER EX:: EXECUTERSCRIPT(CLICK);
 * 
 * 
 * 
 * 
 * 	
 */
	
	  public static void main(String[] args) throws InterruptedException {
		 

		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.get("https://demo.nopcommerce.com/");
		 driver.manage().window().maximize();
		 

		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 // this will set my zoom page level at 50% in the webpage 
		 js.executeScript("document.body.style.zoom='50%'"); //will zoom to 50%
		 Thread.sleep(5000);
		 
		 
		  
		 //JAVASCRIPT EXECUTER 
			/*
			 * WebElement inputBox = driver.findElement(By.id("name")); WebElement emailBox
			 * = driver.findElement(By.id("email"));
			 */
		// here imp pONT JS EXECUTOR is not relaed with webdriver driver both are interface in order to establish the relation 
		// So driver is of Webdriver type but the class we mention is of Chrmedriver so techinaclly its object for chromedriver also
		// and once we cast driver with js technically it accepts because js is also parent of chromedriver   
		// object of child class we are storing into parent class variable (it is UPCASTING)
		
		
		 // arguments [0] we have to provide in every case this array 
		 // js executor is alternative of sendkeys 
		 
			/*
			 * js.executeScript("arguments[0].setAttribute('value' ,'Mohammed Masood ')",
			 * inputBox); js.
			 * executeScript("arguments[0].setAttribute('value' ,'shahidmasood666@yahoo.com ')"
			 * , emailBox);
			 * 
			 * //sometimes we cannot use click method in that case WebElement radioButton =
			 * driver.findElement(By.xpath("//input[@id='male']"));
			 * js.executeScript("arguments[0].click()", radioButton);
			 */
		  
	//=======================================================================================================
		
		//SCROLLING THE PAGE WITH JAVASCRIPT EXECUTER
		
		 // SCROLL BAR BELONGS TO BROWSER NOT THE WEBPAGE IS  NOT ELEM3NT 
		// WE CAN SCROLL THE BAR IN THE MIDDLE OR TILL THE ELEMENT IS VISIBLE ON THE CONDITION
		
		
		//1) scroll down page By pIXEL number
		 
	//  js.executeScript("window.scrollBy(0,-9584)", "");
	
	
		 
		 //capture the pixel value based on which axis i want to scroll y axis will be done vertically
		 // it will return the scrollbar position in webpage based on when statement moved 
		 // to go to iniital page we just need tp subtract 
		// System.out.println(js.executeScript("return window.pageYOffset;")); //3000
		 
		 
		 
		 
		 //2 nd Aprrocah ill scroll down the page till i find my desired element 
		 
		 
			/*
			 * WebElement ele = driver.findElement(By.
			 * xpath("//div[@class='title']//strong[text()='Community poll']"));
			 * js.executeScript("arguments[0].scrollIntoView();", ele);
			 * System.out.println(js.executeScript("return window.pageYOffset;"));
			 */ //2411
		 
		 
		 // if we want to zoom or zoom out or minimize page using javascript executor 
		 
		 
		 

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
