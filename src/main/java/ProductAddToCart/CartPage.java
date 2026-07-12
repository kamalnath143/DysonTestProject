package ProductAddToCart;

import Utils.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage extends WaitUtils {

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
