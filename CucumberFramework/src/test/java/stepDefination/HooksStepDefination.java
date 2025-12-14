package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksStepDefination { // before and after will execute for only for browswer
	WebDriver driver;
//this is before hooks
	@Before
	public void browserSetup() {
		System.out.println("I m inside browser setUp");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	/*difference between chromedriver and webdriver object  
	 * we cannot access the metods of webdriver if we use chromedriver object as refrenece 
	 * we can only access remotewebdriver methods
	 * 
	 */
	
	//important point to remmeber if we have two before ANnotation and two after annotation 
	//it will work in the order we list lets say we have @before1(order=1) @before2(order=0)
	//order 0 will execute first depending upon order number itherise no order given will execute 
	//on alaphabetical order but with @after (order =1) @after (order =2) it will execute in reverse order
	//order 2 will execute first than order 1 will execute 
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("I am inside before step");
	}

	

	@Given("user  on login page")
	public void user_on_login_page() throws Exception {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("shahidmasood666@yahoo.com");;
		driver.findElement(By.name("pass")).sendKeys("hajar123");;
		Thread.sleep(2000);
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() throws Exception {
		driver.findElement(By.name("login")).click();;
		Thread.sleep(2000);
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		System.out.println("Iam inside the homepage ");
		Thread.sleep(1000);
	}
	
	@AfterStep
	public void afterStep() {
		System.out.println("This is after step");
		
	}
	
	//this is after hooks
	@After
	public void tearDows() {
		System.out.println("I m exting browser now after all work ");
		driver.close();
		driver.quit();
	}

}