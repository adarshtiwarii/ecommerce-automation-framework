package tests;

import base.BaseClass;
import pages.HomePage;
import org.testng.annotations.Test;

public class OrderTest extends BaseClass {

    @Test(priority = 4)
    public void verifyOrderPlacement() {

        HomePage homePage = new HomePage(driver);

        homePage.addProductToCart();
        homePage.clickViewCart();

        System.out.println("Order Flow Started");
    }
}