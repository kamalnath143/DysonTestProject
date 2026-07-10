package Testcases;

import Utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HairCarePage extends WaitUtils {

    protected WebDriver driver;

    //Constructor
    public HairCarePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//div[text()='Straighteners']")
    WebElement straighteners;

    public void clickStraighteners()
    {
        straighteners.click();
    }
    @FindBy(css=".product-item")
    List<WebElement> productNames;

    By Product = By.cssSelector(".product-item");
    By addToCart = By.cssSelector(".actions-primary form");

    //Action methods
    public List<WebElement>ProductList()
    {
        waitForElementToAppear(Product);
        return productNames;
    }

    public WebElement getProductName(String ProductName)
    {
        WebElement prod = ProductList().stream().filter(product->
                product.findElement(By.cssSelector("a")).getText().equals(ProductName)).findFirst().orElse(null);
        return prod;
    }

    public void addProductToCart(String ProductName)
    {
        WebElement prod = getProductName(ProductName);
        prod.findElement(addToCart).click();
    }

    @FindBy(css="svg[class='icon icon--basket']")
    WebElement cartItem;
    public CartPage CartItem()
    {
        waitForWebElementToAppear(cartItem);
        cartItem.click();
        CartPage cart = new CartPage(driver);
        return cart;
    }
}

