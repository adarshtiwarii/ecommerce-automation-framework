package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseClass {

    protected WebDriver driver;        // WebDriver reference
    protected WebDriverWait wait;      // Explicit wait reference

    @BeforeClass

    public void setup() {

        // Automatically setup chromedriver
        WebDriverManager.chromedriver().setup();

        // Chrome options (browser maximize)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        // Launch Chrome browser
        driver = new ChromeDriver(options);

        // ✅ Added Implicit Wait (Important)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Explicit wait (10 sec)
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open Automation Exercise website
        driver.get("https://automationexercise.com/");
    }

    @AfterClass

    public void tearDown() {
        driver.quit();  // Close browser after each test
    }
}