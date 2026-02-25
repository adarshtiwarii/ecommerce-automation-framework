package tests;

import base.BaseClass;
import pages.LoginPage;
import pages.AccountCreationPage;
import utilities.RandomUtils;
import utilities.PercyUtils;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginTest extends BaseClass {

    @Test
    public void verifySignupAndLoginFlow() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.clickSignupLogin();

        String email = RandomUtils.generateRandomEmail();
        String mobile = RandomUtils.generateRandomNumber();

        // Signup
        loginPage.enterSignupName("Adarsh");
        loginPage.enterSignupEmail(email);
        loginPage.clickSignupButton();

        AccountCreationPage accountPage = new AccountCreationPage(driver);

        accountPage.fillAccountDetails("Test@123");

        accountPage.fillAddressDetails(
                "Adarsh",
                "Tiwari",
                "Lucknow Address",
                "Uttar Pradesh",
                "Lucknow",
                "226001",
                mobile
        );

        accountPage.clickCreateAccount();

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//b[contains(text(),'Account Created!')]")));

        // Continue after account creation
        driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();

        // Now verify logged in
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[contains(text(),'Logged in as')]")));

        // Percy Snapshot
        PercyUtils percy = new PercyUtils(driver);
        percy.takeSnapshot("User Logged In Successfully");

        System.out.println("Signup + Login Successful: " + email);
    }
}