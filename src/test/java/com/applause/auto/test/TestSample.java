package com.applause.auto.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.applause.auto.framework.test.BaseAppiumTest;
import com.applause.auto.framework.test.BaseWebDriverTest;
import com.applause.auto.pageframework.testdata.TestConstants;

public class TestSample  extends BaseWebDriverTest{
		
	public TestSample(){
		System.out.println("jjjjjjjjjjjjjjjjjjj");
	}
	
	@Test
	@BeforeMethod(alwaysRun = true)
	public static void setup() {
		System.out.println("2222222222222222222");
	}

	@BeforeSuite(alwaysRun = true)
	public static void init() {
		System.out.println("33333333333333333333333333333");
	}

	@Test
	@BeforeTest(alwaysRun = true)
	public static void testSetup() {
		System.out.println("gggggggggggggggggggggggggggggggggg");
	}

	@Test(groups = { TestConstants.TestNGGroups.REG }, description = "test_1")
	public void test_1() {
		System.out.println("11111111111111111");
	}


}
