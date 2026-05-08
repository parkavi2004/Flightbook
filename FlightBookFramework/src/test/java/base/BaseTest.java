package base;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.DriverFactory;
import utils.ConfigReader;

public class BaseTest {

    public static WebDriver driver;

    @BeforeMethod

    public void setup() {

        driver =
                DriverFactory.initDriver();

        driver.get(
                ConfigReader.getBaseUrl());
    }

    @AfterMethod

    public void teardown() {

        // comment this temporarily
        // driver.quit();
    }
}