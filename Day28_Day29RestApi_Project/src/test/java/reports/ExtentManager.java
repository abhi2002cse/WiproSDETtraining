package reports;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentManager implements ITestListener
{
    ExtentSparkReporter sparkReporter;
    ExtentReports extent;
    ExtentTest test;

    public void onStart(ITestContext context)
    {
        sparkReporter =
                new ExtentSparkReporter("ExtentReport.html");

        extent = new ExtentReports();

        extent.attachReporter(sparkReporter);

        extent.setSystemInfo("Tester", "Abhishek");
    }

    public void onTestSuccess(ITestResult result)
    {
        test = extent.createTest(result.getName());

        test.pass("Test Passed");
    }

    public void onTestFailure(ITestResult result)
    {
        test = extent.createTest(result.getName());

        test.fail("Test Failed");
    }

    public void onFinish(ITestContext context)
    {
        extent.flush();
    }

	
}