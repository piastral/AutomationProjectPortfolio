package justPracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainClass  {
	public static int  tableRow;
	public static int column;
	
	
	
	
	public static void m1()
	
	{
		 WebDriver driver=	BaseClass.handleBrowser();
	
		tableRow=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	    column = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
	    for(int r=2;r<=tableRow;r++)
		{
			for (int c=1;c<=column;c++)
			{
				String value=	driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				
				System.out.print(value + " \t ");
			}
			System.out.println();
		}
	   driver.quit();

	}
	
	
	
	

}
