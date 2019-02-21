package General;

import PageObject.*;
import Testcases.*;
import com.relevantcodes.extentreports.ExtentReports;
import dbconnection.dbConn;

import static Config.configProperties.Environment;

public class MainCall {

    static ExtentReports extent;

    public static ExtentReports startReport(){
        extent = new ExtentReports(System.getProperty("user.dir") +"/reports/ExtentReport.html", true);
        extent.addSystemInfo("Environment", Environment);
        return extent;
    }

    public static ExtentReports getExtentReport(){
        if (extent != null) {
            return extent;
        } else {
            throw new IllegalStateException("Extent Report object not initialized");
        }
    }

    public final static registerLoginPage loginPage = new registerLoginPage();
    public final static dashboardPage logging = new dashboardPage();

    public final static webDriverWaits webDriverWait = new webDriverWaits();

    public final static dbConn DbConn = new dbConn();
    public final static basicFlows basicFlows = new basicFlows();

    public final static loginTests loginTests = new loginTests();

}
