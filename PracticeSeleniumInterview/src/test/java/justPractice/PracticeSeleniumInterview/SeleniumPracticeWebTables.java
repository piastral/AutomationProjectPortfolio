package justPractice.PracticeSeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPracticeWebTables {
	// first task is to find the proper locater to locate the element in tables 
	// hint if there is multiple tables in webpage go with xpath and axes 
	//if there is one table o with tagname 
	
	 //this content about static table 
	
	public static void main(String[] args) throws Exception {
		 //i need to locate the element in the table then loop around and perform the action 
		 WebDriver driver = new ChromeDriver();
		 
				  driver.get("https://testautomationpractice.blogspot.com/");
		/*i want to find total number of Rows in Table 
         one more point when doing method chaining whatever method you keep in last always find that
        return the type of method and store in one variable except void 
	 */
		//1 find the total rows 		  
	//multipke tables preffered approach
		 
//			  int rows1 =driver.findElements(By.tagName("tr")).size();
//  			  System.out.println(rows1); //single table preffred approach 
 		
		//find the total NUMBER OF column 
		/*
		 * int column=
		 * driver.findElements(By.xpath("//table[@name='BookTable']//tr[7]//td")).size()
		 * ; System.out.println(column);
		 */
				  // we are capturing the data one single so use findelement 
					/*
					 * String bookName=
					 * driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).
					 * getText(); System.out.println(bookName); // Master in Selenium
					 * driver.close();
					 */
	 
	 
	  
	   //total number of coulumns 
	 int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
	 
	//3- read data from all the rows and columns  {{ nested for loop outer loop fro rows and inner loop column
	Thread.sleep(3000);
	
	/*
	 * System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
	 * 
	 * 
	 * for(int r=2;r<=rows;r++) 
	 * 
	 * { for(int c=1;c<=cols;c++) { String value=
	 * driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+
	 * "]")).getText(); System.out.print( value + "\t" );
	 * 
	 * 
	 * } System.out.println(); }
	 * 
	 * driver.quit();
	 */
	
	 //sometimes we need to retrieve the data based on conditional based ...
	// i want to print book name whose author name is Mukesh 
	  //1-find the author name with xpath 2- store the name in one variable 3- find the bookname 
	 // match with author and find the answer 
	int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	System.out.println("The Total Rows is :" +rows); 
	   
//	for(int r=2;r<=rows;r++) 
//	{
//		String author= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
//		  if(author.equals("Mukesh"))
//		  {
//		  String BookName= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
//		 System.out.println(author + " " +BookName);
//		  }
//		   
//	}
//	
	 int total =0;
	  for(int r=2;r<=rows;r++)
	  {
		  String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		  total =total+Integer.parseInt(price);
		   
	  }
	  System.out.println("Total Price of The Book is " + total);
	 
	   
	 
				
		
		
		
	}
	
	
	

}
