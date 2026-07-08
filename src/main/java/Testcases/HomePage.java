package Testcases;

import Utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    protected WebDriver driver;
    WebDriverWait wait;

    // Locators
    By closeBanner = By.id("btn-close-sticky-promo");
    By hairCareMenu = By.xpath("//li[@class='header__nav-item'][3]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    //wait mechanism to wait for the close banner to be clickable and then click on it
    public void closeStickyBanner() {
        WaitUtils wait = new WaitUtils(driver);
        wait.waitForClickable(closeBanner);
    }
    public void clickHairCareMenu() {
        driver.findElement(hairCareMenu).click();
    }
}
