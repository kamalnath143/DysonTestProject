package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils
{
    WebDriver driver;
    WebDriverWait wait;

    public WaitUtils(WebDriver driver) {
        this.driver = driver;
        wait =new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public boolean waitForClickable(By closeBanner) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(closeBanner)).click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
