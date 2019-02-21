package Testcases;

import Config.configProperties;
import General.MainCall;
import PageObject.registerLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import General.baseTest;
import General.webDriverFactory;


public class loginTests extends baseTest {

    @Test()
    public static void registerToApplication() {
        MainCall.loginPage.register(configProperties.userName, configProperties.password);
        Assert.assertTrue(webDriverFactory.getDriver().findElement(registerLoginPage.byRegisterHeading).isDisplayed(), "Please Register");
    }

    @Test()
    public static void login() {
        MainCall.loginPage.register(configProperties.userName, configProperties.password);
        Assert.assertTrue(webDriverFactory.getDriver().findElement(registerLoginPage.byRegisterHeading).isDisplayed(), "Login");
    }


}