package Testcases;

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

    public void CheckOutPage(String email,String phone,String firstName,String lastName,String gstNumber,String pincode,String addressLine1,String addressLine2)
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


//    public void enterEmail(String email) {
//        driver.findElement(By.cssSelector("input[id='customer-email']")).sendKeys(email);
//    }
//
//    public void enterPhone(String phone) {
//        driver.findElement(By.cssSelector("input[data-di-field-id='shipping-phone-number']")).sendKeys(phone);
//    }
//
//    public void enterName(String firstName, String lastName) {
//        driver.findElement(By.cssSelector(
//                "input[data-di-field-id='shipping-first-name']")).sendKeys(firstName);
//        driver.findElement(By.cssSelector(
//                "input[data-di-field-id='shipping-last-name']")).sendKeys(lastName);
//    }
//    public void GSTNumber(String GST)
//    {
//        driver.findElement(By.cssSelector("input[data-di-field-id='shipping-gst']")).sendKeys(GST);
//    }
//
//    public void CheckBox()
//    {
//        driver.findElement(By.cssSelector("input[name='custom_attributes[opt_in]")).click();
//    }
//    public void enterPincode(String pincode) {
//        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(pincode);
//        driver.findElement(By.xpath("//span[text()='Confirm Pincode']")).click();
//    }
//
//    public void enterAddress(String addr1, String addr2) {
//        driver.findElement(By.cssSelector(
//                "input[data-di-field-id='shipping-street-address-1']")).sendKeys(addr1);
//        driver.findElement(By.cssSelector(
//                "input[data-di-field-id='shipping-street-address-2']")).sendKeys(addr2);
//    }
//
//    public void continueToPayment() {
//        driver.findElement(By.cssSelector(
//                "button[name='continue_to_payment']")).click();
//    }
//    public void CodeSuccess()
//    {
//        System.out.println("CodeSuccess");
//    }
}
