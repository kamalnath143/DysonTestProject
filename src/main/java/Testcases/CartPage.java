package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    protected WebDriver driver;

    By CheckOut = By.cssSelector("button[title='Continue to checkout']");

    //Using Constructor
    public CartPage(WebDriver driver)
    {
        this.driver =driver;
    }

    public void ProceedToCheckOutPage()
    {
        driver.findElement(CheckOut).click();
    }
}
