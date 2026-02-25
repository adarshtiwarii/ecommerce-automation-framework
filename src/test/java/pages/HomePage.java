package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // ✅ Login Validation Updated
    public boolean isLoggedIn() {
        return driver.findElement(
                By.xpath("//a[contains(text(),'Logged in as')]")
        ).isDisplayed();
    }

    // ✅ Add To Cart FIXED (JS click added)
    public void addProductToCart() {

        WebElement firstProduct = driver.findElement(
                By.xpath("(//div[@class='product-image-wrapper'])[1]"));

        // Hover required
        Actions actions = new Actions(driver);
        actions.moveToElement(firstProduct).perform();

        WebElement addToCartBtn = driver.findElement(
                By.xpath("(//a[contains(text(),'Add to cart')])[1]"));

        // Scroll to element
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView(true);",
                addToCartBtn);

        // JS Click (Bypass Ad Overlay)
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].click();",
                addToCartBtn);
    }

    public void clickViewCart() {
        driver.findElement(By.xpath("//u[text()='View Cart']")).click();
    }

}