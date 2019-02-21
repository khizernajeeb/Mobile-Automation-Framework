package General;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.Calendar;
import java.util.Date;

public class baseTest{

    ExtentTest logger;

    @BeforeSuite()
    public void startReport() throws MalformedURLException{
        MainCall.startReport();
        webDriverFactory.startDriver();


    }

    @BeforeMethod()
    public void beforeTest(Method method)  {
        logger = MainCall.getExtentReport().startTest(method.getName(), "");
        logger.setStartedTime(getTime());

    }

    @AfterMethod()
    public void QuitDriver(ITestResult result) {
        try {
            if (result.getStatus() == ITestResult.FAILURE) {
                logger.log(LogStatus.FAIL, "Test Case Failed reason is: " + result.getThrowable());
                logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshots.takeScreenshot(result.getMethod().getMethodName())));

            } else if (result.getStatus() == ITestResult.SKIP) {
                logger.log(LogStatus.SKIP, "Test Case Skipped is: " + result.getName());
            } else {
                logger.log(LogStatus.PASS, result.getMethod().getMethodName() + " is Passed");
            }

            logger.setEndedTime(getTime());
            MainCall.getExtentReport().endTest(logger);
        }

        finally {
//            webDriverFactory.finishDriver();
        }
    }

    private Date getTime()
    {
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime();
    }

    @AfterSuite()
    public void endReport(){
        MainCall.getExtentReport().flush();
        MainCall.getExtentReport().close();
    }

}
