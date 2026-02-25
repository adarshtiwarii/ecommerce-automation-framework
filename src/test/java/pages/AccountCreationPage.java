package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountCreationPage {

    WebDriver driver;

    public AccountCreationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillAccountDetails(String password) {

        // Select Title
        driver.findElement(By.id("id_gender1")).click();

        // Enter password
        driver.findElement(By.id("password")).sendKeys(password);

        // Select Date of Birth
        new Select(driver.findElement(By.id("days"))).selectByValue("10");
        new Select(driver.findElement(By.id("months"))).selectByValue("5");
        new Select(driver.findElement(By.id("years"))).selectByValue("1995");

        // Scroll if needed (optional)
    }

    public void fillAddressDetails(String firstName, String lastName, String address, String state, String city, String zip, String mobile) {

        driver.findElement(By.id("first_name")).sendKeys(firstName);
        driver.findElement(By.id("last_name")).sendKeys(lastName);
        driver.findElement(By.id("address1")).sendKeys(address);

        new Select(driver.findElement(By.id("country"))).selectByVisibleText("India");

        driver.findElement(By.id("state")).sendKeys(state);
        driver.findElement(By.id("city")).sendKeys(city);
        driver.findElement(By.id("zipcode")).sendKeys(zip);
        driver.findElement(By.id("mobile_number")).sendKeys(mobile);
    }

    public void clickCreateAccount() {
        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
    }

    public boolean isAccountCreated() {
        return driver.findElement(By.xpath("//b[contains(text(),'Account Created!')]")).isDisplayed();
    }
}