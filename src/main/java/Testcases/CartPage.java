package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    protected WebDriver driver;

    //Using Constructor
    public CartPage(WebDriver driver)
    {
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="button[title='Continue to checkout']")
    WebElement CheckOut;
    public void ProceedToCheckOutPage()
    {
        CheckOut.click();
    }
}
