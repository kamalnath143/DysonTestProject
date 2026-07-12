package DysonSearchToAddToCart;

import Utils.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StoreLocation extends WaitUtils {
    WebDriver driver;

    public StoreLocation(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }

    @FindBy(css = "a[aria-label='Store finder']")
    WebElement Storefinder;

    @FindBy(css = "a[aria-label='Bengaluru']")
    WebElement StoreCity;

    @FindBy(id = "dyson__select-155-r24")
    WebElement StoreLocation;

    public void StoreLocation()
    {
        Storefinder.click();
        StoreCity.click();
        StoreLocation.click();

    }
}

