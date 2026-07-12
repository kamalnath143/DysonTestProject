package DysonSearchToAddToCart;

import Utils.WaitUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends WaitUtils {

    WebDriver driver;

    public SearchPage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
    }

    @FindBy(id ="btn-close-sticky-promo")
    WebElement closeBannerElement;

    @FindBy(xpath="//button[@class='header__search__input-open']")
    WebElement searchIcon;

    @FindBy(xpath = "//input[@placeholder='dyson.in']")
    WebElement SearchItem;

    public void SearchProduct(String item)
    {
        waitForWebElementToAppear(closeBannerElement);
        this.closeBannerElement.click();
        searchIcon.click();
        SearchItem.click();
        waitForWebElementToAppear(SearchItem);
        SearchItem.sendKeys(item, Keys.ENTER);

    }
}
