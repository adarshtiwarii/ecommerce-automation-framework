package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {

    WebDriver driver;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    // Enter name
    public void enterName(String name) {
        driver.findElement(By.name("name")).sendKeys(name);
    }

    // Enter email
    public void enterSignupEmail(String email) {
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(email);
    }

    // Click Signup button
    public void clickSignupButton() {
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
    }
}