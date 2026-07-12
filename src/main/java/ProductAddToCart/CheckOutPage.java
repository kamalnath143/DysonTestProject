package ProductAddToCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CheckOutPage {

    protected WebDriver driver;

    public CheckOutPage(WebDriver driver)  {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="customer-email")
    WebElement emailAddress;

    @FindBy(id="div[id='customer-email-error']")
    WebElement Errormessage;

    @FindBy(css="input[data-di-field-id='shipping-phone-number")
    WebElement phoneNumber;

    @FindBy(css="input[data-di-field-id='shipping-first-name")
    WebElement firstName;

    @FindBy(css="input[data-di-field-id='shipping-last-name")
    WebElement lastName;

    @FindBy(css="input[data-di-field-id='shipping-gst")
    WebElement gstNumber;

    @FindBy(css="input[name='custom_attributes[opt_in]")
    WebElement checkBox;

    @FindBy(xpath="//input[@type='number']")
    WebElement pincode;

    @FindBy(xpath="//span[text()='Confirm Pincode']")
    WebElement confirmPincode;

    @FindBy(css="input[data-di-field-id='shipping-street-address-1']")
    WebElement addressLine1;

    @FindBy(css="input[data-di-field-id='shipping-street-address-2']")
    WebElement addressLine2;

    @FindBy(css="button[name='continue_to_payment']")
    WebElement continueToPaymentButton;

    public void CheckOutPage(String email, String phone, String firstName, String lastName, String gstNumber, String pincode, String addressLine1, String addressLine2)
    {
        emailAddress.sendKeys(email);
        phoneNumber.sendKeys(phone);
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        this.gstNumber.sendKeys(gstNumber);
        this.checkBox.click();
        this.pincode.sendKeys(pincode);
        confirmPincode.click();
        this.addressLine1.sendKeys(addressLine1);
        this.addressLine2.sendKeys(addressLine2);
        continueToPaymentButton.click();

    }
    public String Errorvalidation()
    {
        return Errormessage.getText();
    }
}