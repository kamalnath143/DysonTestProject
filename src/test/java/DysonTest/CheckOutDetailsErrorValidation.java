package DysonTest;

import Base.BaseTest;
import Testcases.CartPage;
import Testcases.CheckOutPage;
import Testcases.HairCarePage;
import Testcases.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class CheckOutDetailsErrorValidation extends BaseTest {

    @Test
    public void CheckOutProduct() throws IOException, InterruptedException {

        String ProductName = "Dyson Airstrait™ straightener (Ceramic pink/Rose gold)";
        HomePage home = new HomePage(driver);
        HairCarePage hair =home.HomePageMenuBar();

//        HairCarePage hair = new HairCarePage(driver);
        hair.clickStraighteners();
        List<WebElement> products = hair.ProductList();
        hair.addProductToCart(ProductName);
        CartPage cart = hair.CartItem();
//      CartPage cart = new CartPage(driver);
        boolean match =cart.VerfyProductDisplay(ProductName);
        Assert.assertTrue(match);
        CheckOutPage checkout = cart.ProceedToCheckOutPage();

//        CheckOutPage checkout = new CheckOutPage(driver);
        checkout.CheckOutPage("kamalnath0240!gmail.com", "6300204482", "kamal", "nath", "843638", "516360", "4/1277-burrasadu mattam", "4/1244, burrasadhu");

       Assert.assertEquals("Please enter a valid email address (Ex: johndoe@domain.com).", checkout.Errorvalidation());
        System.out.println("Test completed successfully");

    }
}