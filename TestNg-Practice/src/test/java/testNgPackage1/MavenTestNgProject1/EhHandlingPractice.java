package testNgPackage1.MavenTestNgProject1;

public class EhHandlingPractice {
	/*
	 * Finally block the lines contained inside the finally block will be executed
	 * wehathger or not an exception occurs the block is written after the end of
	 * all catch blocks synatx:: finally { print::"hello" } finally block is used to
	 * execute the necessary code of the program we can have multiple catch block
	 * exception is class which extends from Throwable
	 * 
	 * imp java question ?
	 * while writing a program what exception did you face??
	 * there are given scenarios where unchecked exception may occur 
	 * -----------------------------------------------------------------------------------
	 * 1- A scenario where ArithmeticException occurs (divide any number by 0)
	 * ---------------------------------------------------------------------------------
	 * 2- A scenario where NullPointerException occurs 
	 * if we have null value in any variable performing any operation on the variable throws A nullPointer 
	 * example::String s =null; sysout(s.length()) //null pointer exception
	 * -------------------------------------------------------------------------
	 * 3- A scenario where array index out of bounds exception 
	 * when an array exceeds it size limt 
	 * example::int a[] =new int[5]----a[10] =50 // 10 is not there 
	 * --------------------------------------------------------------------
	 * 4-StringIndexOutOFbOUNDeXCEPTION ::
	 * similiar to arrayIndexOutOfBound :this arises when non -existen string index is accessed
	 * example:: String s= Mo;
	 * system.out.println(s.charAt(2)) // will throw exception /returns type of charAt is integer
	 * ---------------------------------------------------------------------------------------------
	 * 5-FileNotFoundException ::
	 * this exception occurs when an attempt to open afile denoted by specified pathname has failed
	 * example:: FileInputStream f=  new FileInputStream ("C:\\users\\Desktop\\input.xls")
	 * hereNote:: this error will occur if input.xls file is not present in avobe location or lets say giving 
	 * wrong location or path 
	 * --------------------------------------------------------------------------------------------
	 * 6-IoException/mismatch
	 * This exception occurs when there has been failure in the input/output operations
	 * ------------------------------------------------------------------------------------------
	 * 
	 * 
	 */

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println("babu");

		System.out.println("i love you ");

		try {

			String ptr = null;
			System.out.println(ptr.length());

			System.out.println(10 / 0);

		} catch (ArithmeticException l) {
			;
			System.out.println(l.getMessage());

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("rest of code");
		}

	}

}
