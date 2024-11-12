package listeners;


import com.aventstack.extentreports.Status;
import core.BaseTest;
import extentreports.ExtentTestManager;
import logs.Log;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static extentreports.ExtentManager.getExtentReports;


public class ReportListener implements ITestListener {

    WebDriver driver;

    public String getTestName(ITestResult result) {
        return result.getTestName() != null ? result.getTestName()
                : result.getMethod().getConstructorOrMethod().getName();
    }

    public String getTestDescription(ITestResult result) {
        return result.getMethod().getDescription() != null ? result.getMethod().getDescription() : getTestName(result);
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        Log.info("Start testing " + iTestContext.getName());
        iTestContext.setAttribute("WebDriver", driver);

    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        Log.info("End testing " + iTestContext.getName());
        //Kết thúc và thực thi Extents Report
        getExtentReports().flush();
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        Log.info(getTestName(iTestResult) + " test is starting...");
        ExtentTestManager.saveToReport(iTestResult.getName(), iTestResult.getTestName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        Log.info(getTestName(iTestResult) + " test is passed.");
        //ExtentReports log operation for passed tests.
        ExtentTestManager.logMessage(Status.PASS, iTestResult.getInstanceName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        Log.error(iTestResult.getInstanceName() + " test is failed.");
        try{
            ExtentTestManager.addScreenShot(Status.FAIL, iTestResult.getInstanceName());

        }catch (Exception e){
            ExtentTestManager.logMessage(Status.INFO,"can not screen shot ");
        }

        ExtentTestManager.logMessage(Status.FAIL, iTestResult.getThrowable().toString());
        ExtentTestManager.logMessage(Status.FAIL, iTestResult.getInstanceName() + " is failed.");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        Log.warn(getTestName(iTestResult) + " test is skipped.");
        ExtentTestManager.logMessage(Status.SKIP, getTestName(iTestResult) + " test is skipped.");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        Log.error("Test failed but it is in defined success ratio " + getTestName(iTestResult));
        ExtentTestManager.logMessage("Test failed but it is in defined success ratio " + getTestName(iTestResult));
    }
}
