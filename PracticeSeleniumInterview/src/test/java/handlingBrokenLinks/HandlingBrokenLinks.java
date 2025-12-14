package handlingBrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrokenLinks {
/* broken links:: WHen we sent a request to the server and when we dont get reseources back 
 * for example in terms of if the website says error 404 ,link not found ,or server not available 
 * So in those cases we need to handle the links ,the reason for the response like this is caused 
 * by Broken Link And thats what we should HANDLE
 * 
 * BROKEN LINKS:: DOESNT HAVE RESOURCE IN CRORRESPONDING SERVER
 * 
 * How we can find which one is broken link or which is not ??
 * =================================================================
 * ANS )) If the links is having resource in a server ,resource will be returned
 * else status-code will be returned (based on the status code ) we will find out 
 * 
 * Link should have href attribute 
 * 1- href ="" we cannot verify the link exist or not 
 * based on the status code we need to check the based on condition 
 * if the link status code => 400(broken links)
 * status code < 400 == not broken links 
 * 	
 */
	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
	
		/* 1)==  capture the href attribute value of every link then run in loop since its List of Webelement 
		 * after this will do one condition inside loop which will say if href is null or href doesnt have value 
		 * print it doesnt have and then continue dont end the loop
		 * 
		 * 
		 * 
		 */
		
	List<WebElement> allLinks=   driver.findElements(By.tagName("a"));
	  System.out.println("check total number of Links ::=" + allLinks.size());
	  
	  int numberOfBrokenLinks=0;
	  
	   for(WebElement linkElement :allLinks)
	   {
	       String hrefAttribute= linkElement.getDomProperty("href");
	       if(hrefAttribute==null || hrefAttribute.isEmpty())
	       {
	    	   System.out.println("Href value is null or empty .So not possible to Check");
	    	   continue;
	       }
	        // now imagine there is value in href now ill make sure ill hit the server (inside for loop ) resource part comes later 
	        //from STRING TO URL FORMAT WE HAVE TO CONVERT
	       
	     try
	     {
	       URI uri = new URI(hrefAttribute);
	          URL linkUrl =   uri.toURL(); // convertted href value from string to URL FORMAT
	          // this method will open connection to the server it will return connection object
	     HttpURLConnection connectionLink =  (HttpURLConnection) linkUrl.openConnection(); // open connection to the server 
	     connectionLink.connect(); //will connect to the server and send request to the server
	    
	     if(connectionLink.getResponseCode()>=400 )
	     {
	    	 System.out.println(hrefAttribute+" These Are  Broken Link");
	    	 numberOfBrokenLinks++;
	     }else 
	     {
	    	 System.out.println(hrefAttribute +"not Broken Link ");
	     } 
	     
	     }catch(Exception e) 
	     {
	    	 
	     }
	   
		
		
	   }
	   System.out.println("Number Of Broken Links " + numberOfBrokenLinks);
	   
	}
		
		
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


