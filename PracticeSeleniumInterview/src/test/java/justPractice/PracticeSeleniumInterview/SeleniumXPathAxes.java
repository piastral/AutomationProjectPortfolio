package justPractice.PracticeSeleniumInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumXPathAxes {
    public static void main(String[] args) throws InterruptedException {
    	
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.myntra.com/men-formal-shirts?p=1");
    
   	  Thread.sleep(5000);
}

	
	
	
/* xpath axes
 * ============================
 * navigate from top to bottom 
 * navigate from bottom to top 
 *   lets say we are in element ..we want to go to parent or anscetors we can navigate from the current element
 *   to parent and anscestor
 *   
 *   same from the current element can also be called as (self) we can navigate  to child and grandchild 
 *   one tag or element can have miltiple childs elements grandchild(descendent) from the self node or current node to grandchild
 *   we will use the keyword called decendent 
 *   
 *   under parent also we can have siblings which is brother of current node or element we are working on 
 *   in html language we called this as preceding-sibling  and next elemnt as following sibling
 *   avobe the current element we call(preceding-sibling)
 *   below the current element we call ( following-sibling)
 *   xpath axes we  need to write double coloun follower by tagname of the element we are looking 
 *   
 *   current element or self ---> //input[@id="user-name"]/self::input    // this is syntax for self element or current
 *   parent--->  //input[@id="user-name"]/parent::div   [[we want to navigate to parent from current node ]]
 *   anscetor---> //input[@id="user-name"]/ancestor::form [[ here we go to ancestor ]]
 *   child--->  //div[@class="login-box"]/child::form 
 *   
 *     descendent ---> //div[@class="login-box"]/descendant::div[1]
 *   
 *   preceding sibling -->//input[@id="password"]/parent::div/preceding-sibling::div
 *   
 *   following-sibling --->   	//input[@id="password"]/following-sibling::keeper-lock
 *    
 *   preceding-->
 *   following--->
 * 
 * --------------------------------------------------------------------------------------------------'
 * Selenium XPATH AXES TRICKY QUESTION:::======>>>>>
 * ---------------------------------------------------------
 * Complex xpath interview question 
 * Q1-->1-> go to myntra.com 
 * 2-> inside myntra.com go to men section
 * 3--> click the formal shirts under men  section 
 * 4---> there is 3 filter on left side every one has checkbox
 * 5---> my main question is to find common Xpath --by passing the fiter header text
 * FILTER HEADER TEXT ARE
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 1-> BRAND 2--> COLOR 3--> DISCOUNT RANGE 
 * 
 * answer::1-this is for brand  
 *   //span[text()="Brand"]/following-sibling::ul//label[contains(@class,'common')]
 * ------------------------------------------
 * 2-this is for color
 * //span[text()='Color']/following-sibling::ul//label[contains(@class,'common')]
 * --------------------------------------------------------------
 * 3- for discount range 
 * 
 * //span[text()='Discount Range']/following-sibling::ul//label[contains(@class,'common')]
 * -----------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------
 * 
 * ajio.com 
 * interview question 
 * 1- go to gender section taje the tabe of gender as header 
 * go to female section it will take two male and female 
 * my main intention to choose unique locator for both category 
 * 
 * //span[text()='gender']/parent::div/following-sibling::div//label[contains(@class,'facet-linkname')]
 * -----------------------------------------------------------------------------------------------------
 * 
 * 2---> category 
 * //span[text()='category']/parent::div/following-sibling::div//label[contains(@class,'facet-linkname')]
 * ---------------------------------------------------------------------------------------------------------
 * 3-->for PRICE 
 * //span[text()='price']/parent::div/following-sibling::div//label[contains(@class,'facet-linkname')]
 * 
 * for price range max to minimum
 * //span[text()='Enter Price Range']/parent::div/following-sibling::div//input[@type='text']
 * -----------------------------------------------------------------------------------------------------
 * 4-->
 * 
 * 
 * 
 * 
 * 	
 */
	
    

}
