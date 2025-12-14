package myPraciceCodingSeleniumAll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		// first we need to switch into the frame then we can perform sendkeys operation 
		//Frame 1 using webelement for that we need to get the frame and store in webeelement
		
	WebElement frame1=	driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
	driver.switchTo().frame(frame1);
		 WebElement textBox1 =	driver.findElement(By.xpath("//input[@name='mytext1']"));
	textBox1.sendKeys("Mohammed");
	// first you need come out of First Frame1 using default content() it will take you to the main webpage 
	//from there you again go inside frame 2
driver.switchTo().defaultContent();
	WebElement frame2=  driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
	driver.switchTo().frame(frame2);
WebElement	textBox2 =driver.findElement(By.xpath("//input[@name='mytext2']"));
	textBox2.sendKeys("masood");
	
	//To go frame 3 fist i need to come out from frame 2 
	driver.switchTo().defaultContent();
	
	WebElement frame3 =driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver.switchTo().frame(frame3); 
	
WebElement textBox3=	driver.findElement(By.xpath("//input[@name='mytext3']"));
	textBox3.sendKeys("Hajar My Love");
	
	
	}

}
