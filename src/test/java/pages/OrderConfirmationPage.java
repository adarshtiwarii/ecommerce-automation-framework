package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderConfirmationPage {

    WebDriver driver;

    public OrderConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    // Success message locator
    By successMsg = By.xpath("//b[contains(text(),'Order Placed!')]");

    public String getSuccessMessage() {
        return driver.findElement(successMsg).getText();
    }
}