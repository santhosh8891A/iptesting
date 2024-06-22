package testng.selenium;

import org.testng.annotations.Test;

public class SecondTestNG {
	
	@Test(groups= {"smoke","Negative"})
	public void method()
	{
		System.out.println("This is the method in second class-smoke Negative");
		
	}
	
	@Test
	public void method2()
	{
		System.out.println("This is the method2 in second class");
		
	}

}
