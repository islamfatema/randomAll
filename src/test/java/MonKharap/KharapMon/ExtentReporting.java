package MonKharap.KharapMon;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporting {
	
	@Test
	public void reporting() {
	
ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extentReports.html");

ExtentReports extent=new ExtentReports();
extent.attachReporter(htmlReporter);

ExtentTest test=extent.createTest("Google search","Validation");

String projectPath=System.getProperty("user.dir");


test.log(Status.INFO, "This step shows usage of log(status, details)");
	
//test.info("This step shows usage of INFO(status, details)");
//test.fail("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
//test.addScreenCaptureFromPath("screenshot.png");	
	}


}
