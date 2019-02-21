package General;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.util.concurrent.TimeUnit;

public class webDriverWaits {

    public static WebElement fluentWait(final WebElement locator, int timeout){

        Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriverFactory.getDriver())
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(org.openqa.selenium.NoSuchElementException.class);

        return wait.until(ExpectedConditions.visibilityOf(locator));

    }

    public void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
