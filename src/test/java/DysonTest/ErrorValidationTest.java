package DysonTest;

import Base.BaseTest;
import ProductAddToCart.CartPage;
import ProductAddToCart.HairCarePage;
import ProductAddToCart.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class ErrorValidationTest extends BaseTest {

    @Test
    public void Errorvalidation() throws IOException, InterruptedException {

        String ProductName = "Dyson Airstrait™ straightener (Ceramic pink/Rose gold)";
        HomePage home = new HomePage(driver);
        HairCarePage hair =home.HomePageMenuBar();

        hair.clickStraighteners();
        List<WebElement> products = hair.ProductList();
        hair.addProductToCart(ProductName);
        CartPage cart = hair.CartItem();
        boolean match =cart.VerfyProductDisplay("Dyson Airstrait™ straightener (Ceramic pink/Rose gold");
        Assert.assertTrue(match);


        System.out.println("Test completed successfully");

    }
}