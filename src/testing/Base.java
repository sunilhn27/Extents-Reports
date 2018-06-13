package testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class Base {

	public static ExtentReports rep = ExtentReports.get(Base.class);
	public static Logger log = Logger.getLogger("SunilLog");
	public static WebDriver d;

	public Base() {
		rep.init("I:\\REST API Testing\\WORKSPACE\\Extent\\src\\Report\\SEEME.html", true);
		rep.config().reportTitle("Test Report");
		rep.config().displayCallerClass(true);
//		rep.config().displayTestHeaders(true);
		rep.config().reportHeadline("Test");
		String path = "I:\\REST API Testing\\WORKSPACE\\Extent\\log4j.properties";
		PropertyConfigurator.configure(path);
	}

	public static void infoAndReport(String message) {
		log.info("Message: " + message);
		rep.log(LogStatus.INFO, message);
	}

	public static void FailAndReport(String message) {
		log.info("Message: " + message);
		rep.log(LogStatus.FAIL, message);
	}

	public static void PassAndReport(String message) {
		log.info("Message: " + message);
		rep.log(LogStatus.PASS, message);
	}

	public static void SkippedAndReport(String message) {
		log.info("Message: " + message);
		rep.log(LogStatus.SKIP, message);
	}

	public static void Screenshot(String name) throws IOException {
		File scr = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("I:\\REST API Testing\\WORKSPACE\\Extent\\src\\Screenshot\\" + name));

	}
}
