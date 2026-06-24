package Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Listener implements ITestListener {

    ExtentReports extent =
            ExtentManager.getReport();

    ExtentTest test;

    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        test.pass("Test Passed");
    }

    public void onTestFailure(ITestResult result) {
        test.fail(result.getThrowable());
    }

    public void onFinish(ITestContext context) {
        extent.flush();
    }
}