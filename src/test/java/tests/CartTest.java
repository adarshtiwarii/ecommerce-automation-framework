package tests;

import base.BaseClass;
import pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseClass {

    @Test(priority = 3)
    public void verifyAddToCart() {

        HomePage homePage = new HomePage(driver);

        homePage.addProductToCart();
        homePage.clickViewCart();

        Assert.assertTrue(
                driver.getCurrentUrl().contains("view_cart"),
                "Cart Page Not Opened"
        );
    }
}