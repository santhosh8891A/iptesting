package testng.selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenertsTesting implements ITestListener {
	
	public  void onTestStart(ITestResult result) {
	     
		System.out.println("Test Case Started");
	  }

	  /**
	   * Invoked each time a test succeeds.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SUCCESS
	   */
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Success");
	  }

	  /**
	   * Invoked each time a test fails.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#FAILURE
	   */
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Failed");
	  }

	  /**
	   * Invoked each time a test is skipped.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SKIP
	   */
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case skipped");
	  }

	  /**
	   * Invoked each time a method fails but has been annotated with successPercentage and this failure
	   * still keeps it within the success percentage requested.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SUCCESS_PERCENTAGE_FAILURE
	   */
	
	  /**
	   * Invoked each time a test fails due to a timeout.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   */
	

	  /**
	   * Invoked before running all the test methods belonging to the classes inside the &lt;test&gt;
	   * tag and calling all their Configuration methods.
	   *
	   * @param context The test context
	   */
	public void onStart(ITestContext context) {
		System.out.println("All Test Cases Started -second");
	  }

	  /**
	   * Invoked after all the test methods belonging to the classes inside the &lt;test&gt; tag have
	   * run and all their Configuration methods have been called.
	   *
	   * @param context The test context
	   */
	public void onFinish(ITestContext context) {
		System.out.println("Test Case Finished");
	  }

}
