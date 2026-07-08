package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    protected WebDriver driver;

    // Locators
    By closeBanner = By.id("btn-close-sticky-promo");
    By hairCareMenu = By.xpath("//li[@class='header__nav-item'][3]");

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }
    public void closeStickyBanner() {
        driver.findElement(closeBanner).click();
    }

    public void clickHairCareMenu() {
        driver.findElement(hairCareMenu).click();
    }
}
