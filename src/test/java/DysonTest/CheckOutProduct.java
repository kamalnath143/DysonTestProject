package DysonTest;

import Base.BaseTest;
import Testcases.*;
import org.testng.annotations.Test;

import java.io.IOException;

public class CheckOutProduct extends BaseTest{

    @Test
    public void CheckOutProduct() throws IOException, InterruptedException {

        HomePage home = new HomePage(driver);
        HairCarePage hair = new HairCarePage(driver);
        CartPage cart = new CartPage(driver);

        home.closeStickyBanner();
        home.clickHairCareMenu();

        hair.clickStraighteners();
        hair.productAddToCart();
        hair.cartItem();

        cart.ProceedToCheckOutPage();

        CheckOutPage checkout = new CheckOutPage(driver);
        checkout.CheckOutPage("kamalnath0240@gmail.com", "6300204482", "kamal", "nath", "843638", "516360", "4/1277-burrasadu mattam", "4/1244, burrasadhu");

        System.out.println("Test completed successfully");

    }
}