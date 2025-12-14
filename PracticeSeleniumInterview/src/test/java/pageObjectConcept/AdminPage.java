package pageObjectConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	
	WebDriver driver;
	 public AdminPage(WebDriver driver) 
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 
	 }
	 
	 // find the loctaor for admin and click the admin 
	 @FindBy(xpath="//div[@class='oxd-sidepanel-body']/ul/li[1]")
	 WebElement admin;
	 
	 //search name in usernamecheckbox
	 @FindBy(xpath="//div[@class='oxd-table-filter']//following-sibling::input[contains(@class,'oxd-input ')]") 
	  WebElement userName_CheckBox;
	 
	 
	 // Action method
	 public void adminClick()
	 {
		 admin.click();
	 }
	 
	 void userNameSearch(String user)
	 {
		userName_CheckBox.sendKeys(user); 
	 }
	 
	 // action method to search in username 
	 

	 
	
	 
	 
	 
	 
	 
	 

}
