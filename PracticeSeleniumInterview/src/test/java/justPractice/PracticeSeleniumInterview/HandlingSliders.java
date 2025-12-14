package justPractice.PracticeSeleniumInterview;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HandlingSliders {
	
/* ACTION VS ACTIONS ( TWO KEYWORD IN JAVA)
 * Action is ==> an interface it is used to store the creation action  will only execute the action  
 * build()== > creates an action 
 * perform() =executes an action 
 * 
 * Actions ===> it is class we can also create an object 
 * 	in selenium using selenium we can handle drag,drop,rightclick using context
 * click,move toElement(mouse hover ) etc 
 * =====================================================================================================
 * Handling the SLIDERS 
 * how to handle ::==>> 
 * 
 * 
 * 
 * 
 * 	
 */
	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		 //mouse action we have to create action class and then we will drag and drop
        Actions actObject =new Actions(driver);
        
       
		//MINIMUMSLIDER
		
		        WebElement minSlider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		        
		     /* this will return the location of minimum slider returns X AXIS AND Y AXIS 
		      * IF THE SLIDER IS Horizontal  (IMPORTANT) WE WIL ONLY CHANGE X AXIS AND Y AXIS WILL REMAIN FIXED 
		      * IF THE SLIDER IS VERTICAL ( ONLY Y AXIS WILL BE CHANGED NOT X AXIS)
		      *
		      */
System.out.println("Default Location of The miNSlider before moving" +minSlider.getLocation()); //59(X) ,250 (Y)
	   
	// HERE THE METHOD TAKES TWO PARMETER THE MIN SLIDER AND INCREASED VALUE OF X AXIS WCHICH WILL ADD TO THE XISTING LOCATION 
	    actObject .dragAndDropBy(minSlider, 100, 0).perform();
	    System.out.println("New Location of The miNSlider after moving" +minSlider.getLocation()); //(158 ,250)
	    
	 
	    //MAXIMUM SLIDER
       WebElement maxSlider= driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
        System.out.println("THE DEFAULT LOCATION OF MAXIMUM SLIDER IS ::==>"  + maxSlider.getLocation());// (613, 250 )
	    
        // now to move max slider i need to decrease the value ( we have to provide subtraction sign )
          actObject .dragAndDropBy(maxSlider, -200, 0).perform();
          System.out.println("New Location of The maxSlider after moving" +maxSlider.getLocation());
          
       
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		         
	}

}
