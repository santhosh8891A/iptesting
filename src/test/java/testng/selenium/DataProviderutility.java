package testng.selenium;

import org.testng.annotations.DataProvider;

public class DataProviderutility {
	
	@DataProvider(name = "testData")
	public Object[][] dataProiderMethod() {

		return new Object[][] { { "Chrome", "Amazon.com. Spend less. Smile more." },
				                { "Edge", "Amazon.com. Spend less. Smile more." } };

	}

}
