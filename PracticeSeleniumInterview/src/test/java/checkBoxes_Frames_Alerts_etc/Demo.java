package checkBoxes_Frames_Alerts_etc;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {
	/*author : mohammed masood
	 * date :	 * 
	 */
	//Action class 
	public static ChromeOptions options;
	public static WebDriver driver ;
	public static int  tableRow;
	public static int column;
	
//test
	public static void webTableHandle()
	{
		 options = new ChromeOptions();
		options.addArguments("--start-maximized").addArguments("--incognito");
	    driver = new ChromeDriver(options);
	    driver.get("https://testautomationpractice.blogspot.com/");
	    
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

		
		
	}

	public static void main(String[] args) {
		
		// There are Two types of table

		/*
		 * static and dynamic static where data is fixed and dynamic where data change
		 * everyday (complex to handle ) like stock market robinhod
		 * 
		 * 
		 */
		// what is the benefit of using chromoptions ...see chromeOptions handle
		// diretcly with chrom browser
		// and any thing that is related with browser can be handled using chromeoptions
		// argument list

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized").addArguments("--incognito");

		WebDriver driver = new ChromeDriver(options);
		// "https://testautomationpractice.blogspot.com/" use this to handle static web
		// tables

		driver.get("https://testautomationpractice.blogspot.com/");

		// we know in web table we have rows and column like excel we have rows and
		// column
		/*
		 * By locatorBookTable = By.xpath("//table[@name='BookTable']//tr");
		 * List<WebElement> tableRow = driver.findElements(locatorBookTable);
		 * tableRow.size();
		 */
		
		
	int tableRow=	driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		// i need to find how many rows are available in BookTable //

		System.out.println("The Total rows is :" + tableRow);

		// according to the last method will be called in chain will be the return type
		// of that method , but if there is no return type
		// it will return void .
		int column = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
		System.out.println("The Number of Columns avaialble is :" + column);
		
		//we need to find data in web table using xpath logic 
		
		int tableData = driver.findElements(By.xpath("//table[@name='BookTable']//tr//td")).size();
		System.out.println("Total Data available is :" + tableData);
		
		for(int r =2; r<=tableRow;r++) // row start from 0 till 7 which is end of tablerow 
			//tablerow =7 is 3<=7  true 
		{
			for(int c=1;c<=column;c++) // column start from 1 till 4 2<=4 true goes to next line
			{
				// tr["+r+"]//td["+c+"] ===> if we want to pass variable in xpath we need to concatenate rows and column like this
			String value=	driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
			
			System.out.print(value + " \t ");
			
			
				
			}
			System.out.println();
		}
		// what challenges you faced in your project ??
		/*1-) using wait explicit wait we handle the dynamic element 
		 * 2-) we handle the table // in my 3rd project i handled the webtable using nested 
		 * loop
		 * 3-) 
		 *  
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
