package com.anudip.JUnitTesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class ServiceTest {
	
	//Test Before All Test are start
	@BeforeClass
	public static void beforeAll() {
		System.out.println("Before All Test Casses only once");
	}
	
	//Before each test start
	@Before
	public void before() {
		System.out.println("Before Each Test case");
	}

	//test on particular task or method
	@Test
	public void doCalculationTest() {
		int result = Service.doCalculation(12, 12);
		int expect_result = 24;
		
		Assert.assertEquals(expect_result, result);
	}
	
	//test on particular task or method with time limit
	@Test(timeout=1)
	public void doProductTest() {
		int res = Service.doProduct(11, 11);
		int expect_res=121;
		
		Assert.assertEquals(expect_res,res);
	}
	
	//test after each task complete
	@After
	public void after() {
		System.out.println("After Each Test Case");
	}
	
	//test after all test complete
	@AfterClass
	public static void afterAll() {
		System.out.println("After all Test Cases");
	}
	
}
