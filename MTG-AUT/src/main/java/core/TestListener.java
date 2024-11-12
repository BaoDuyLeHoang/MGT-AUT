package core;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onFinish(ITestContext result) {
        Log.info("Finish automation test");
    }

    @Override
    public void onStart(ITestContext result) {
        Log.info("Start automation test");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult result) {
        Log.error("FAIL: " + result.getInstanceName());

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        Log.warn("PASSED: " + result.getName());

    }

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Log.info("SUCCESS: " + result.getInstanceName());
    }
}