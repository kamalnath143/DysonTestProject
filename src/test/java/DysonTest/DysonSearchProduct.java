package DysonTest;

import Base.BaseTest;
import DysonSearchToAddToCart.SearchPage;
import DysonSearchToAddToCart.SearchProduct;
import DysonSearchToAddToCart.StoreLocation;
import org.testng.annotations.Test;

public class DysonSearchProduct extends BaseTest {

    @Test
    public void LocationFinder()
    {
//        StoreLocation store = new StoreLocation(driver);
//        SearchPage search = store.StoreLocation();
        SearchPage search = new SearchPage(driver);
        search.SearchProduct("Vaccum");
        SearchProduct product = new SearchProduct(driver);
        product.addToCartTOProduct();
        StoreLocation store = new StoreLocation(driver);
        store.StoreLocation();





    }
}
