package testing;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

public class Listners extends Base implements ITestListener {

	public void onTestStart(ITestResult result) {
		rep.startTest(result.getName() + " Test started");
		Base.infoAndReport(result.getName() + " Test Started");
	}

	public void onTestSuccess(ITestResult result) {
		Base.PassAndReport(result.getName() + " Test Passed");
	}

	public void onTestFailure(ITestResult result) {
		Base.FailAndReport(result.getName() + " Test Falied");
	}

	public void onTestSkipped(ITestResult result) {
		Base.SkippedAndReport(result.getName() + " Test Skipped");
		rep.log(LogStatus.SKIP, "hi");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {
		rep.startTest("Test started" + context.getName());
		System.out.println("name " + context.getName());
	}

	public void onFinish(ITestContext context) {
		rep.endTest();

	}
}