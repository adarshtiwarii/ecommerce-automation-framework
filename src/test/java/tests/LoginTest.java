package tests;

import base.BaseClass;
import pages.LoginPage;
import pages.AccountCreationPage;
import pages.HomePage;
import utilities.RandomUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    @Test
    public void verifySignupAndLoginFlow() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.clickSignupLogin();

        String randomEmail = RandomUtils.generateRandomEmail();
        String password = "Test@123";

        // ---------- SIGNUP ----------
        loginPage.enterSignupName("Adarsh");
        loginPage.enterSignupEmail(randomEmail);
        loginPage.clickSignupButton();

        AccountCreationPage accountPage =
                new AccountCreationPage(driver);

        accountPage.fillAccountDetails(password);

        accountPage.fillAddressDetails(
                "Adarsh",
                "Tiwari",
                "Lucknow",
                "UP",
                "Lucknow",
                "226001",
                RandomUtils.generateRandomNumber()
        );

        accountPage.clickCreateAccount();

        // Click Continue
        driver.findElement(
                By.xpath("//a[@data-qa='continue-button']")
        ).click();

        // ---------- VALIDATION ----------
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(
                homePage.isLoggedIn(),
                "Signup/Login Failed"
        );

        System.out.println("Signup + Login Successful: " + randomEmail);
    }
}