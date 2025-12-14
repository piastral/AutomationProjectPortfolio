package testNgPackage1.MavenTestNgProject1;

public class ThrowKewyordExceptionHandling {

/*THROWS KEYWORD ::
 * the Throws keyword is used to indicate that particular method may throw an exception a apecific type
 * the caller of this method has to handle the exception using try-catch block .the throw Keyword declares
 * an Exception and if not handled cause compilation 
 * ------------------------------------------------------------------------------------------------------
 * Interview Questions::?
 * whats is the difference between throw keyword and throws keyword
 * ans:java throw keyword used to throw exception explictily in the code inside the methody body 
 * or in the block of code 
 * -----------------------------------------------------------------------------------------------------
 * whereas java throws kewyord us used in the method signature to declare an exception which might be thrown by 
 * method while the code is being executed
 * ----------------------------------------------------------------------------------------------------
 * In our Selenium we also face the exception ifelement is not sync with locator properly 
 * the test script will not run and will throw excetion ""No suchElement Exception
 * -----------------------------------------------------------------------
 * "SessionNotCreatedException" will throw when our files are not present 
 * 	
 */
	public static void checkNum(int num) {
		if(num <1) {
			throw new ArithmeticException("Number is negative cannot calculate square");
		
		}
	}


	public static void main(String[] args) throws Exception {
		checkNum(0);

	}

}
