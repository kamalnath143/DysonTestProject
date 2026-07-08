package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

    protected WebDriver driver;

    public CheckOutPage(WebDriver driver)
    {
        this.driver =driver;
    }
    public void enterEmail(String email) {
        driver.findElement(By.cssSelector("input[id='customer-email']")).sendKeys(email);
    }

    public void enterPhone(String phone) {
        driver.findElement(By.cssSelector("input[data-di-field-id='shipping-phone-number']")).sendKeys(phone);
    }

    public void enterName(String firstName, String lastName) {
        driver.findElement(By.cssSelector(
                "input[data-di-field-id='shipping-first-name']")).sendKeys(firstName);
        driver.findElement(By.cssSelector(
                "input[data-di-field-id='shipping-last-name']")).sendKeys(lastName);
    }
    public void GSTNumber(String GST)
    {
        driver.findElement(By.cssSelector("input[data-di-field-id='shipping-gst']")).sendKeys(GST);
    }

    public void CheckBox()
    {
        driver.findElement(By.cssSelector("input[name='custom_attributes[opt_in]")).click();
    }
    public void enterPincode(String pincode) {
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(pincode);
        driver.findElement(By.xpath("//span[text()='Confirm Pincode']")).click();
    }

    public void enterAddress(String addr1, String addr2) {
        driver.findElement(By.cssSelector(
                "input[data-di-field-id='shipping-street-address-1']")).sendKeys(addr1);
        driver.findElement(By.cssSelector(
                "input[data-di-field-id='shipping-street-address-2']")).sendKeys(addr2);
    }

    public void continueToPayment() {
        driver.findElement(By.cssSelector(
                "button[name='continue_to_payment']")).click();
    }
    public void CodeSuccess()
    {
        System.out.println("CodeSuccess");
    }
}
