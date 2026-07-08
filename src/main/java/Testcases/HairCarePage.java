package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HairCarePage {


    protected WebDriver driver;

    By Straighteners = By.xpath("//div[text()='Straighteners']");
    //By PopupClose = By.xpath("//aside[@class='modal-popup custom_data_prospect modal-slide _show'] //button[@class='action-close']");
    By ProductName = By.cssSelector("h3.card_product_name");
    By addToCartButtons = By.xpath("//a[text()='Add to cart']");
    By cartItem = By.cssSelector("svg[class='icon icon--basket']");

    // using constructor
    public HairCarePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStraighteners() {
        driver.findElement(Straighteners).click();
    }

    public void productAddToCart() {
        List<WebElement> Products = driver.findElements(ProductName);
        List<WebElement> addToCart = driver.findElements(addToCartButtons);
        for (int i = 0; i < Products.size(); i++) {
            String product = Products.get(i).getText();
            if (product.contains("Dyson Airstrait")) {
                //Clicking on add to cart
                addToCart.get(i).click();
                break;
            }
        }
    }

    public void cartItem ()
    {
        driver.findElement(cartItem).click();
    }
}

