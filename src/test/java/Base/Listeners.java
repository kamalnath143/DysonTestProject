package Base;

import Utils.ExtentReporterNG;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners extends BaseTest implements ITestListener
{
    ExtentTest test;
    ExtentReports extent = ExtentReporterNG.getReportObject();
    @Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub
        test =extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub
        test.log(Status.PASS, "Execution pass");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.fail(result.getThrowable());

        try {

            driver = (WebDriver) result.getTestClass()

                    .getRealClass()

                    .getField("driver")

                    .get(result.getInstance());

            if (driver != null) {

                String filePath = getScreenshot(

                        result.getMethod().getMethodName(), driver);

                test.addScreenCaptureFromPath(filePath,

                        result.getMethod().getMethodName());

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    @Override
    public void onFinish(ITestContext result) {
        // TODO Auto-generated method stub
        extent.flush();

    }

}
