package DysonTest;

import Base.BaseTest;
import Testcases.*;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class CheckOutProduct extends BaseTest {

    @Test
    public void CheckOutProduct() throws IOException, InterruptedException {

        String ProductName = "Dyson Airstrait™ straightener (Ceramic pink/Rose gold)";
        HomePage home = new HomePage(driver);
        home.HomePageMenuBar();

        HairCarePage hair = new HairCarePage(driver);
        hair.clickStraighteners();
        List<WebElement> products = hair.ProductList();
        hair.addProductToCart(ProductName);
        hair.CartItem();
        CartPage cart = new CartPage(driver);
        cart.ProceedToCheckOutPage();

        CheckOutPage checkout = new CheckOutPage(driver);
        checkout.CheckOutPage("kamalnath0240@gmail.com", "6300204482", "kamal", "nath", "843638", "516360", "4/1277-burrasadu mattam", "4/1244, burrasadhu");

        System.out.println("Test completed successfully");

    }
}