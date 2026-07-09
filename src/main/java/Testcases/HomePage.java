package Testcases;

import Utils.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends WaitUtils {

    protected WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

   @FindBy(id ="btn-close-sticky-promo")
    WebElement closeBannerElement;

    @FindBy(xpath ="//li[@class='header__nav-item'][3]")
    WebElement hairCareMenu;

    //Action method
    public void HomePageMenuBar()
    {
        this.closeBannerElement.click();
        hairCareMenu.click();

    }
}
