package PageObject;

import General.MainCall;
import org.openqa.selenium.By;
import General.baseTest;
import General.webDriverFactory;

public class registerLoginPage extends baseTest {

    public registerLoginPage() {
    }

    //RegisterLogin Locators
    public static By byEmail = By.id("com.appsgallery.sagar.loginregistrationexample:id/editLogin");
    public static By byPassword = By.id("com.appsgallery.sagar.loginregistrationexample:id/editPasswordLogin");
    public static By byRegisterButton = By.id("com.appsgallery.sagar.loginregistrationexample:id/register");
    public static By byRegisterHeading = By.id("com.appsgallery.sagar.loginregistrationexample:id/textView7");



    //Register
    public void register(String userMail, String pwd) {
        webDriverFactory.getDriver().findElement(byEmail).sendKeys(userMail);
        webDriverFactory.getDriver().findElement(byPassword).sendKeys(pwd);
        webDriverFactory.getDriver().findElement(byRegisterButton).click();

    }


}
