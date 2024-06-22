package SeleniumPractice;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentsreporttesting {

	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentHtmlReporter htmlReporter;
	public static SimpleDateFormat simpleDate;

	public static void main(String[] args) throws IOException {
	 
		Date date = new Date();//Current Date
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy-HH-mm-ss");//format the Date
		String strDate = formatter.format(date);
		htmlReporter = new ExtentHtmlReporter("ExtentReportResults" + strDate + ".html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Extent Report Demo");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		
		
				
		  test=extent.createTest("Second Test");//First Test case created/started
		  test.pass("Test case passed");
		  test.fail("TEst case failed"+test.addScreenCaptureFromPath("F:\\Automation Training\\Rough\\sample.png"));
		  extent.flush();//Completed the test case.
	}

}
