package DysonTest;

import Base.BaseTest;
import ProductAddToCart.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class CheckOutProductTest1 extends BaseTest {

    String ProductName = "Dyson Airstrait™ straightener (Ceramic pink/Rose gold)";
    @Test(dataProvider ="getData", groups = {"DataProvider"})
    public void CheckOutProduct(String ProductName, String email) throws IOException, InterruptedException {

        HomePage home = new HomePage(driver);
        HairCarePage hair =home.HomePageMenuBar();

        hair.clickStraighteners();
        List<WebElement> products = hair.ProductList();
        hair.addProductToCart(ProductName);
        CartPage cart = hair.CartItem();
        boolean match =cart.VerfyProductDisplay(ProductName);
        Assert.assertTrue(match);
        CheckOutPage checkout = cart.ProceedToCheckOutPage();

        checkout.CheckOutPage(email, "6300204482", "kamal", "nath", "843638", "516360", "4/1277-burrasadu mattam", "4/1244, burrasadhu");

        System.out.println("Test completed successfully");

    }

    @DataProvider
    public Object[][] getData()
    {
        return new Object[][] {{"Dyson Airstrait™ straightener (Ceramic pink/Rose gold)","kamalnath0240@gmail.com" },
                {"Dyson Airstrait™ dryer and straightener (Bright Nickel/Rich Copper)","p.kamalnath00@gmail.com"}};
    }
}