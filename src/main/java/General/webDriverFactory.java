package General;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import static Config.configProperties.platformName;


public class webDriverFactory {
    public static AppiumDriver driver;

    public static AppiumDriver<MobileElement> getDriver() {
        if (driver != null) {
            return driver;
        } else {
            throw new IllegalStateException("Driver has not been initialized");
        }
    }

    public static AppiumDriver startDriver() throws MalformedURLException {
        switch (platformName) {
            case "Android":
                driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilitiesGenerator.getCapabilities());
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;

            case "iOS":
                driver = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilitiesGenerator.getCapabilities());
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void finishDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
