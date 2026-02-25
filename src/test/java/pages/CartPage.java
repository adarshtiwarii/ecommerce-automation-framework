package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Checkout button
    By checkoutBtn = By.xpath("//a[contains(text(),'Proceed To Checkout')]");

    public void clickCheckout() {
        driver.findElement(checkoutBtn).click();
    }
    public int getCartItemCount() {
        return driver.findElements(By.className("cart_item")).size();
    }

}