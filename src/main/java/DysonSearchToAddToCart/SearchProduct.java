package DysonSearchToAddToCart;

import Utils.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProduct extends WaitUtils {
    WebDriver driver;

    public SearchProduct(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
    }

    @FindBy(xpath = "//li[@class='item product product-item'] //a[@id='acc-product-37099']")
    WebElement itemName;

    @FindBy(css = "label[for='Wet and Dry']")
    WebElement ProductVariant;

    @FindBy(xpath = "//div[@class='product__info'] //a[text()='Add to Cart']")
    WebElement AddToCart;

    public void addToCartTOProduct()
    {
        itemName.click();
        waitForWebElementToAppear(ProductVariant);
        ProductVariant.click();
        AddToCart.click();

    }

}
