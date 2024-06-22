package testng.selenium;

import org.testng.annotations.Test;

public class ThirdTestNG {
	
	@Test(groups= {"smoke","Positive"})
	public void method()
	{
		System.out.println("This is the method in third class-smoke Posotive");
		
	}
	
	@Test
	public void method2()
	{
		System.out.println("This is the method2 in third class");
		
	}

}
