package testNgPackage1.MavenTestNgProject1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotaions {
	
/*@DataProvider ::
 * we are using Dataprovider annotations to pass the multiple data in single test case
 * 
 * @data provider annotations helps us write data-driven test cases.the data provider annotation enables
 * us to run atest method multiple times by passing different data sets 
 * Syntax:: @DataProvider (name="name of data-provider")
 * 
 * it is very imprtant we dont need to write data for finding 
 * 	
 */
	@DataProvider (name ="data-provider")
	public Object [][] dpMethod(){
		return new Object[][] {{"data-one"},{"data-two"},{"data-three"}};
	}
	
	@Test(dataProvider ="data-provider")
	public void testMethod(String data) {
		System.out.println("Data is ::"+data);
	}
	

}
