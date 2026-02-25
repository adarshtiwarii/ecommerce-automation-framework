package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // ===== COMMON =====

    public void clickSignupLogin() {
        driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click();
    }

    // ===== LOGIN METHODS =====

    public void enterEmail(String email) {
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
    }

    // ===== SIGNUP METHODS =====

    public void enterSignupName(String name) {
        driver.findElement(By.name("name")).sendKeys(name);
    }

    public void enterSignupEmail(String email) {
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(email);
    }

    public void clickSignupButton() {
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
    }

    public void enterLoginEmail(String mail) {
    }

    public void enterLoginPassword(String s) {
    }
}