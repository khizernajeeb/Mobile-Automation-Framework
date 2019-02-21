package PageObject;

import org.openqa.selenium.By;
import General.baseTest;
import General.webDriverFactory;


public class dashboardPage extends baseTest {
    public dashboardPage() {
    }

    //dashboard Locators
    public static By bySample = By.xpath("//XCUIElementTypeTabBar/XCUIElementTypeButton[3]");


    public void sampleFunc() {
        webDriverFactory.getDriver().findElement(bySample).click();
    }

}


