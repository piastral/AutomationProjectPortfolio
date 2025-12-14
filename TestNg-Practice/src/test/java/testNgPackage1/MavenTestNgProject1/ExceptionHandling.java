package testNgPackage1.MavenTestNgProject1;

public class ExceptionHandling {

	/*
	 * Exception meaning abnormal condition an exception is an unwanted or
	 * unexpected event that occurs at runtime .it disrupts the normal flow of the
	 * prgram which often lead to termination of the program is known as exception
	 * and defining alternative ways to handle exception is called exception
	 * handling so exception is also a class
	 * 
	 * -----------------------------------------------------------------------------
	 * ----------------- Exception in java can occur due to several reasons like
	 * tryng to access an element of an array with an index greater than the size of
	 * array ,trying access a non eisting file in your program invalid data
	 * input,newtokr problems ,if i am dividing 10/0 this will throw arithmetic
	 * exception;fortunately java has robust system for handling such errors to
	 * prevent termination of program
	 * -----------------------------------------------------------------------------
	 * ----------------- There is two types of exception in java 1-compile time :
	 * for example not giving semicolong while printing something comiler will throw
	 * error ::Unresolved Compilation 2-runtime
	 * -----------------------------------------------------------------------------
	 * ----------------- lets say we have 10 lines of code and in line #3 we get
	 * unexpected condition so if we dont handle that exception at line number 3 the
	 * code after line #3 will not be executed it will just throw the exception now
	 * in this scenario we know the line#3 will give a problem but in so many
	 * scenario we dont know where the exception can come from on runtime so thatsy
	 * why should handle the exception so after the problem the remaining code gets
	 * executed
	 * 
	 * Ways we can handle the exception :::
	 * -----------------------------------------------------------------------------
	 * ---------------------- 1-Try & Catch block :try is keyword /try is block
	 * -->ex{} -->we need to write risky code for example we know there will be an
	 * exception so we throw the try block to handle try block will always execute
	 * -----------------------------------------------------------------------------
	 * ---------------------- 1a-) catch---> catch is keyword and its is also block
	 * {} we need to write exception handling code that means in this block it will
	 * throw the message why the problem occured if there is exception in try block
	 * than only catch will exectue THere has to be try and catch together otherwie
	 * it will throw the error
	 * single try block can hav multiple catch blocks and try block contains statements which can cause exception
	 * if no exception occur in try block catch block will totally ignored 
	 * -----------------------------------------------------------------------------
	 * ------------ 2-throw kewyord
	 * 
	 * -----------------------------------------------------------------------------
	 * ------ 3-throws but the purpose of each way is different
	 * 
	 */

	/*
	 * public static void main(String[] args) { int arr[]=new int[3]; arr[0] = 100;
	 * arr[1] =200; arr[2] =300; try { arr[3] =400; } catch (Exception k) {
	 * System.out.println("bhai index dekhle ekbar galti kiya hai"); }
	 * 
	 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }
	 */
	/*
	 * public static void main(String[] args) { System.out.println("hi");
	 * 
	 * System.out.println("hello"); System.out.println("babu");
	 * System.out.println("i love you ");
	 * 
	 * try { System.out.println(10/0);
	 * 
	 * }catch(Exception e) {
	 * System.out.println("mama check karo exception ara hai arithmetic wala"); }
	 */

	int[] fun() {
		int[] a = { 10, 20, 30 };
		return a;
	}

	public static void main(String[] args) {
		ExceptionHandling eh = new ExceptionHandling();
		int[] value = eh.fun();

		try {
			for (int i = 0; i < 3; i++) {
				System.out.println(value[i]);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("i am learning coding ,ill get succefull oneday.");
	}
}
