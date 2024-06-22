package testng.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EdgeBR {
	
	@Test
	public void openChromeBr()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com/");
		
	}

}
