package testng.selenium;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class FourthTestNG2 {
	
	@BeforeGroups("smoke2")
	public void methodGroups()
	{
		System.out.println("I am in method groups");
	}
	
	@Test(groups= {"smoke2","Positive"})
	public void method()
	{
		System.out.println("This is the method in fourth class-smoke Positive");
		
	}
	
	@Test
	public void method2()
	{
		System.out.println("This is the method2 in fourth class");
		
	}

}
