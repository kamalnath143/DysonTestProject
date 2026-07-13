package DysonTest;

import Base.BaseTest;
import ProductAddToCart.CartPage;
import ProductAddToCart.CheckOutPage;
import ProductAddToCart.HairCarePage;
import ProductAddToCart.HomePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class CheckOutProductTestHashMap extends BaseTest {

    String ProductName = "Dyson Airstrait™ straightener (Ceramic pink/Rose gold)";
    @Test(dataProvider ="getData", groups = {"DataProvider"})
    public void CheckOutProduct(HashMap<String,String> input) throws IOException, InterruptedException {

        HomePage home = new HomePage(driver);
        HairCarePage hair =home.HomePageMenuBar();

        hair.clickStraighteners();
        List<WebElement> products = hair.ProductList();
        hair.addProductToCart(input.get(ProductName));
        CartPage cart = hair.CartItem();
        boolean match =cart.VerfyProductDisplay(input.get(ProductName));
        Assert.assertTrue(match);
        CheckOutPage checkout = cart.ProceedToCheckOutPage();

        checkout.CheckOutPage(input.get("email"), "6300204482", "kamal", "nath", "843638", "516360", "4/1277-burrasadu mattam", "4/1244, burrasadhu");

        System.out.println("Test completed successfully");

    }

    public String getScreenshot() throws IOException {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File file = new File("C://Users//pkama//OneDrive//Desktop//FrameworkTS");
        FileUtils.copyFile(source, file);
        return ("C://Users//pkama//OneDrive//Desktop//FrameworkTS");

    }

    @DataProvider
    public Object[][] getData() throws IOException {
//        HashMap<Object,Object> map = new HashMap<Object,Object>();
//        map.put("ProductName", "Dyson Airstrait™ straightener (Ceramic pink/Rose gold)");
//        map.put("email","kamalnath0240@gmail.com");
//
//        HashMap<Object,Object> map1 = new HashMap<Object,Object>();
//        map.put("ProductName", "Dyson Airstrait™ straightener (Ceramic pink/Rose gold)");
//        map.put("email","kamalnath00@gmail.com");


        List<HashMap<String,String>> data = getJsonDataTOMap(System.getProperty("user.dir")+"//src//test//java//Dyson//data//DataProvider.json");
        return new Object[][] {{data.get(0)}, {data.get(1)}};
    }

}