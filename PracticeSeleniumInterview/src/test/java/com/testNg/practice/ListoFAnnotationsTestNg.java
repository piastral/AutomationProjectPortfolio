package com.testNg.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ListoFAnnotationsTestNg {
	/*ANS:::EXAMPLE[bwfore the testNg the java has the concept of annotations 
 *    Interview Answer [ANNOTATIONS is a form of metadata that can be added to the java source code ,]
 *    
 *     EXPLAIN TO INTERVIEWR...|DOWN ..
 *      (package,class,variables,methods,paramaeters) this things combinely called as 
 *        java source code so when we add something to this source code we can call them as annotations
 *          ...This java annotation has been introduced in java 1.5
 *                   ...so java provides @override (;ike when subclass override superclass)
 *                       @--->means annotation --->>override means the text which represnt @annotations
	 * 
	 * 
	 * WHAT ARE THE ANNOTATION AVAILABLE IN TEST NG ??
	 * 1-@beforeSuite
	 * 2-@AfterSuite
	 * 3-@before Test ==> in the xml the heiearchy works in such before test can contain multiple classes
	 * 
	 * 4-@AfterTest ==> ( see up)
	 * 5-@BeforeClass ==> WILL EXECUTE BEFORE STARTING OF ALL TEST METHOD
	 * 6-@AfterClass  ===> WILL EXECUTE AFTER COMPLETION OF ALL TEST METHOD
	 * 7-@BeforeMethod ==> WILL EXECUTE BEFORE TEST METHOD ( FOR EXAMPLE THREE 3 TEST METHOD EACH TEST METHOD WILL HAVE ITS RESPECTIVE 
	 *                                                   BEFORE METHOD AND AFTER METHOD)
	 * 8-@AfterMethod ==>WILL EXECUTE AFTER TEST METHOD ( FOR EXAMPLE THREE 3 TEST METHOD EACH TEST METHOD WILL HAVE ITS RESPECTIVE 
	 *                                                   BEFORE METHOD AND AFTER METHOD)
	 * 
	 * 9-@Test ==> THE ACTUAL TEST METHOD WHICH CONTAINS THE LOGIC ASSERTION AND WHICH WILL GIVE THE RESUKT
	 * 10-@Ignore
	 * 11-@BeforeGroup
	 * 12-@AfterGroup
	 * 13-@DataProvider
	 * 14-@Parameter
	 * 15-@Factory
	 * 
	 * 16-@Listeners
	 * 
	 * 
	 * we will use in company or organization the -
	 * emailable-report.html with higher authority
	 * 
	 */
	//lets use first annotations ::
	/*
	 * @Test public void ts1() { System.out.println("this is test scenario 1"); }
	 * 
	 * @Test public void ts2() { System.out.println("this is test scenario 2"); }
	 * 
	 * @Test public void ts3() { System.out.println("this is test scenario 3"); }
	 * //it will print before executing the test case //and if there is multiple
	 * test case in one class it will print //before every test cases
	 * 
	 * @BeforeMethod public void beforeMehtod() {
	 * System.out.println("before method ::hierarchy 4"); }
	 * 
	 * //it will print after executing the test case
	 * 
	 * @AfterMethod public void afterMethod() {
	 * System.out.println("after method ::hierarchy 5 "); }
	 * 
	 * @BeforeClass public void beforeClass() {
	 * System.out.println("before class ::hierarchy 3"); }
	 * 
	 * @AfterClass public void afterClass() {
	 * System.out.println("after class hierarchy 6"); }
	 * 
	 * @BeforeTest public void beforeTest() {
	 * System.out.println("This is Before Test :hierarchy 2"); }
	 * 
	 * @AfterTest public void afterTest() {
	 * System.out.println("This is After Test hierarchy 7"); }
	 * 
	 * @BeforeSuite public void beforeSuite() {
	 * System.out.println("This is Before suite :hierarchy 1(parent)first"); }
	 * 
	 * @AfterSuite public void afterSuite() {
	 * System.out.println("This is After Suite hiearchry 8(last) "); }
	 */

	
	
	/* let say we have tc1 which need to be executed in following steps 
	 * 1) we have to LOGIN @BEFORE METHOD
	 * 2) SEARCH ===> THIS WILL BE ACTUAL TEST METHOD @TEST
	 * 3) LOGOUT ===> @AFTER METHOD 
	 * 4)LOGIN 
	 * 5) ADVANCE SEARCH
	 * 6)LOGOUT
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
