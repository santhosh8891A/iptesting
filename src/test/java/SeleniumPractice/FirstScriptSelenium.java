package SeleniumPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScriptSelenium {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame']")));
		WebElement element = driver.findElement(By.xpath("//a[text()='ThemeRoller']"));
		System.out.println(element.getAttribute("href"));

	}

}
