package DysonTest;

import Base.BaseTest;
import ProductAddToCart.CartPage;
import ProductAddToCart.CheckOutPage;
import ProductAddToCart.HairCarePage;
import ProductAddToCart.HomePage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class CheckOutProductTest extends BaseTest {

    String ProductName = "Dyson Airstrait™ straightener (Ceramic pink/Rose gold)";

    @Test()
    public void CheckOutProduct() throws IOException, InterruptedException {


        HomePage home = new HomePage(driver);
        HairCarePage hair = home.HomePageMenuBar();

        hair.clickStraighteners();
        List<WebElement> products = hair.ProductList();
        hair.addProductToCart(ProductName);
        CartPage cart = hair.CartItem();
        boolean match = cart.VerfyProductDisplay(ProductName);
        Assert.assertTrue(match);
        CheckOutPage checkout = cart.ProceedToCheckOutPage();

        checkout.CheckOutPage("kamalnath6300gmail.com",  "6300204482", "kamal", "nath", "843638", "516360", "4/1277-burrasadu mattam", "4/1244, burrasadhu");
        Assert.assertEquals("Email is missing", checkout.Errorvalidation());
        System.out.println("Test completed successfully");

    }
}