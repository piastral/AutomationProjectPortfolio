package com.testNg.practice;

public class TestNgListeners {
	/*what are the different ways to roduce reports for testNg result??
	 * ans::-testng offer 2 ways to produce report 
	 * 1-listeners implement the interface org.testg.ItestListeners and are notified in real time when test
	 * starts ,passes,fails etc.
	 * 2-Reporters implements the interface org.testng.Ireporter are notified when all the suites 
	 * have been run by testNg .The irporer instance receives a list of object that describes the entire 
	 * test run 
	 * 
	 * 
	 * 
	 * Q::-- WHAT IS THE USE OF @LISTENERS annotation in TestNg??
	 * ans:: TestNg listeners are used to configue reports and logginf one of the most widely used 
	 * listeners in TestNg is ItestListeners interface .it has methods like onTestStart,onTestSuccess,
	 * onTestFailure,on TestSkipped etc . we should implement this interface creating listerner class of our
	 * own Next we should add @listener annotaion (@LISTENERS) in the class which was created 
	 * 
	 * 
	 * Q-->> WHAT ARE @FACTORY ?
	 * ANS:: factory will execute all the test methods present inside a test class using seperate 
	 * instance of the repective class with different set of data .
	 * 
	 * 
	 * 
	 */

}
