package com.testNg.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	/*
	 * WHat is meant by assertion ?? assertion means validation point we have to use
	 * assertions
	 * 
	 * 
	 * 
	 */
	SoftAssert sa;

	@Test(priority = 1)
	void testProgram() {

		System.out.println("This is testing ");
		System.out.println("This is testing ");

		sa = new SoftAssert();
		sa.assertEquals(1, 2);

		System.out.println("This is testing ");
		System.out.println("This is testing ");

		sa.assertAll();

	}

	@Test(priority = 2)
	void testTitle() {

		System.out.println("This is testing ");
		System.out.println("This is testing ");

		String expTitle = "mohammed";
		String actualTtile = "hajar";

		sa = new SoftAssert();
		sa.assertEquals(expTitle, actualTtile);

		System.out.println("This is testing ");
		System.out.println("This is testing ");

		sa.assertAll();

	}

}
