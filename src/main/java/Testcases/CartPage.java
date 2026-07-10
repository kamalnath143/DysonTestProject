package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage extends HairCarePage{

    protected WebDriver driver;

    //Using Constructor
    public CartPage(WebDriver driver)
    {
        super(driver);
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css=".product-info a")
    List<WebElement> CartProducts;

    @FindBy(css="button[title='Continue to checkout']")
    WebElement CheckOut;

//    List<WebElement> CartProducts =driver.findElements(By.cssSelector(".product-info a"));
//    boolean match = CartProducts.stream().anyMatch(product->
//            product.findElement(By.cssSelector("a")).getText().equalsIgnoreCase(ProductName));
//    Assert.assertTrue(match);


    public Boolean VerfyProductDisplay(String ProductName) {
        Boolean match = CartProducts.stream().anyMatch(product ->
                product.getText().equalsIgnoreCase(ProductName));
        return match;
    }
    public CheckOutPage ProceedToCheckOutPage()
    {
        waitForWebElementToAppear(CheckOut);
        CheckOut.click();
        CheckOutPage checkout = new CheckOutPage(driver);
        return checkout;
    }
}
