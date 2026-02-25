package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Place Order button
    By placeOrderBtn = By.xpath("//a[contains(text(),'Place Order')]");

    public void clickPlaceOrder() {
        driver.findElement(placeOrderBtn).click();
    }
}