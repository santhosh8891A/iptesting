package testng.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ChromBR {

	@Test(dataProvider = "testData",dataProviderClass = DataProviderutility.class)
	public void openChromeBr(String br, String title) {
		WebDriver driver = null;
		if (br.contentEquals("Chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new EdgeDriver();
		}

		driver.get("https://www.amazon.com/");
		String actualTitle = title;// As per the requirement
		String expectedTitle = driver.getTitle();

		if (actualTitle.contentEquals(expectedTitle)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	

}
