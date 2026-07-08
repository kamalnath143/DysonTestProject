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
        CheckOutPage checkout = new CheckOutPage(driver);

        home.closeStickyBanner();
        home.clickHairCareMenu();

        hair.clickStraighteners();
        hair.productAddToCart();
        hair.cartItem();

        cart.ProceedToCheckOutPage();

        Thread.sleep(3000);

        checkout.enterEmail("kamalnath0240@gmail.com");
        checkout.enterPhone("6300204482");
        checkout.enterName("kamal", "nath");
        checkout.GSTNumber("843638");
        checkout.CheckBox();
        checkout.enterPincode("516360");
        checkout.enterAddress("4/1277-burrasadu mattam", "4/1244, burrasadhu");
        checkout.continueToPayment();

        System.out.println("Test completed successfully");

    }
}