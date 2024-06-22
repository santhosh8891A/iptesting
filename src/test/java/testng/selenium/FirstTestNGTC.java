package testng.selenium;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGTC {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}


	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@Test(groups= {"smoke","Negative"})
	public void firstTestCase() {
		System.out.println("This is my first TEst NG Test Case-smoke Negative");

	}

	@Test()
	public void secondTestCase() {
		System.out.println("This is my second TEst NG TEst Case");
		 
	}

	@Test()
	public void thirdTestCase() {
		System.out.println("This is my third TEst NG TEst Case");
		 
	}

	@Test()
	public void fourthTestCase() {
		System.out.println("This is my fourth TEst NG TEst Case");
		 
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}

}
